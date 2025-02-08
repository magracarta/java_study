package com.mobliefactory.lotto.application;

import com.mobliefactory.lotto.DTO.Lottonumber;
import com.mobliefactory.lotto.service.LottoNumberCreateService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitializingBeanLottoCreate implements InitializingBean {
    @Autowired
    LottoNumberCreateService lnc;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("첫실행에같이 실행!");
        //로또 번호 생성
        if(lnc.lottosize() == 0){
            System.out.println("로또 번호 생성 중......");
            ArrayList<Lottonumber> registerNumber = lnc.registerNumber();
            System.out.println(registerNumber.size()+"개 생성 완료");
        }
    }
}
