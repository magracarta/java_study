package com.mobliefactory.lotto.service;

import com.mobliefactory.lotto.DAO.ILottonumber;
import com.mobliefactory.lotto.DTO.LottoRegister;
import com.mobliefactory.lotto.DTO.Lottonumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LottoRandomSend {

    @Autowired
    ILottonumber iLottonumber;

    public int registerLotto(String phoneNum){
        int text = 0;
        LottoRegister lr = new LottoRegister();
        //로또의 use가 N이 남아있을때 작동 1을 제외한 번호만 or 이미 응모한 폰번호인지 확인
        if(iLottonumber.checkLottoUse() == 0) return 1;
        if(iLottonumber.checkPhoneNumber(phoneNum) > 0) return 2;
        //랜덤으로 로또 번호 추출(사용하지 않은 번호로) //1을 제외한 번호만
        int seq = iLottonumber.randomGetLottoNumber();
        //폰번호가 010-0000-0000일때는 1등으로
        if(phoneNum.equals("010-0000-0000")) seq=1;
        
        //사용으로 변경
        iLottonumber.updateLottoUse(seq);
        lr.setLottoseq(seq);
        lr.setPhoneNumber(phoneNum);

        //응모 등록
        iLottonumber.saveLottoRegister(lr);
        return text;
    }

    public String getLottoNumber(String phoneNumber) {
        int seq = iLottonumber.getLottoSeq(phoneNumber);
        return iLottonumber.getLottoNumber(seq);
    }

    public Lottonumber getLotto(String phone) {
        int size = iLottonumber.checkPhoneNumber(phone);
        if(size == 0) return null;
        int seq = iLottonumber.getLottoSeq(phone);
        iLottonumber.updateRegister(phone);

        return iLottonumber.getLotto(seq);
    }

    public Lottonumber getFristLotto(int i) {
        return iLottonumber.getLotto(1);
    }
}
