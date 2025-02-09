package com.mobliefactory.lotto.DAO;

import com.mobliefactory.lotto.DTO.LottoRegister;
import com.mobliefactory.lotto.DTO.Lottonumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ILottonumber {
    int randomNumberCreate(int minseq, int maxseq);

    int lottoSize();
    void addLotto(Lottonumber ln);

    int randomGetLottoNumber();

    int checkLottoUse();

    int checkPhoneNumber(String phoneNum);

    void saveLottoRegister(LottoRegister lr);

    int getLottoSeq(String phoneNumber);

    String getLottoNumber(int seq);

    void updateLottoUse(int seq);

    Lottonumber getLotto(int seq);

    void updateRegister(String phone);

    ArrayList<LottoRegister> getLottoRegisterList();

    void allRegisterUpdate();
}
