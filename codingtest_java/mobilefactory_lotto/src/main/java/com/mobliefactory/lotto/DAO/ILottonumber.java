package com.mobliefactory.lotto.DAO;

import com.mobliefactory.lotto.DTO.Lottonumber;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ILottonumber {
    int lottoSize();

    void addLotto(Lottonumber ln);
}
