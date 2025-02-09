package com.mobliefactory.lotto.service;
import com.mobliefactory.lotto.DAO.ILottonumber;
import com.mobliefactory.lotto.DTO.Lottonumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LottoNumberCreateService {
    Random random = new Random();
    private final int lottosize = 45;

    @Autowired
    ILottonumber iLottonumber;
    //첫 시작 로또 번호가 만들어 졌는지 아닌지 판단하기.
    public int lottosize(){
        return iLottonumber.lottoSize();
    }

    //담청 번호 렌덤 6개 만들기
    public ArrayList<Integer> createLottoNumber() {
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        while(lottoNumbers.size() < 6) {
            int randomnumber = random.nextInt(lottosize) + 1;
            //똑같은 숫자가 있으면 다시 숫자 조회
            if(!lottoNumbers.contains(randomnumber)) lottoNumbers.add(randomnumber);
        }
        return lottoNumbers;
    }


    //번호  10000명 생성
    /*
     > 1등(6자리 동일) - 1명
     > 2등(5자리 동일) - 5명
     > 3등(4자리 동일) - 44명
     > 4등(3자리 동일) - 950명
    - 당첨자는 1000명으로 최대 참가가 10,000명에 적절히 분배되어야 함

    - 2등은 2000 ~ 7000명 사이에 넣고 싶어함
    - 3등은 1000 ~ 8000명 사이에 넣고 싶어함
    * */

    public ArrayList<Lottonumber> registerNumber() {
        ArrayList<Integer> numbers = createLottoNumber();
        //등록된 로또 번호들
        ArrayList<Lottonumber> registerednum = new ArrayList<>();
        //1등 넣기 1번에
        createranknumber(registerednum, numbers , 1 , 0 , 1 , 1,1);
        //2등 넣기 2000 ~ 7000명 사이
        createranknumber(registerednum, numbers , 2 , 1 , 5 , 7000,2000);
        //3등 1000 ~ 8000명 사이
        createranknumber(registerednum, numbers , 3 , 2 , 44 , 8000,1000);
        //4등 950명 전체중
        createranknumber(registerednum, numbers , 4 , 3 , 950 , 10000,1);
        //나머지
        createranknumber(registerednum, numbers , 999 , 5 , 9000 , 10000,1);
        return registerednum;
    }
    //로또 등수, 갯수에 따라 번호 만들어내기
    public void createranknumber(ArrayList<Lottonumber> registerednum ,
                                 ArrayList<Integer> numbers,
                                 int rank ,int deffsize , int people,int maxseq, int minseq
                                ) {
        int i = 0;
        while (i < people) {
            ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);
            int randomseq = random.nextInt(maxseq) + minseq;

            //이미 인덱스가 존재하면 코드 실행 x
            if(registerednum.stream().anyMatch(item-> item.getSeq() == randomseq)) continue;

            // Set을 이용하여 중복 체크 최적화
            Set<Integer> usedIndexes = new HashSet<>();
            Set<Integer> usedNumbers = new HashSet<>();
            Integer[] numarr = new Integer[deffsize];

            int j = 0;
            while (j < deffsize) {
                int idx = random.nextInt(5) + 1;  // 랜덤 인덱스 (1 ~ 6)
                Integer num = random.nextInt(lottosize) + 1;  // 랜덤 숫자 (1 ~ lottosize)
                // 중복 체크: numbersCopy에 없는 num과 usedIndexes에 없는 idx로만 추가
                if (!usedNumbers.contains(num) && !usedIndexes.contains(idx) && !numbersCopy.contains(num)) {
                    usedIndexes.add(idx);
                    usedNumbers.add(num);
                    numarr[j] = num;
                    j++;
                }
            }

            // 등록된 번호 중복 검사 후, 중복되지 않으면 번호 추가 및 sql 삽입
            if (repeatNumber(registerednum, randomseq, numarr)) {
                for (int k = 0; k < deffsize; k++) {
                    numbersCopy.set(usedIndexes.toArray(new Integer[0])[k], numarr[k]);
                }
                Lottonumber ln  = lottonumber(numbersCopy, randomseq, rank);
                registerednum.add(ln);
                iLottonumber.addLotto(ln);
                i++;
            }
        }
    }

    //값이 중복되는지 확인
    public static boolean repeatNumber(ArrayList<Lottonumber> registerednum, int randomseq, Integer[] numarr) {
        return registerednum.stream().noneMatch(item ->
                item.getSeq() == randomseq && Arrays.stream(numarr)
                        .anyMatch(n -> item.getNumber().contains(n.toString()))
        );
    }


    //로또 번호 받아서 DTO로 내보내기
    public Lottonumber lottonumber(ArrayList<Integer> numbers, int seq, int rank) {
        //현재 로또 번호 String으로 변경
        StringBuilder stringBuilder = new StringBuilder();
        //로또 번호 DTO 생성 (담기)
        Lottonumber lottonumber = new Lottonumber();
        for(int num : numbers) stringBuilder.append(num+" ");
        lottonumber.setSeq(seq);
        lottonumber.setRank(rank);
        lottonumber.setNumber(stringBuilder.toString());
        lottonumber.setUse(false);

        return lottonumber;
    }
}
