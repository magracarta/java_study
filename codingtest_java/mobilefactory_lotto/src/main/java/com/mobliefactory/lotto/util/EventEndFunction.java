package com.mobliefactory.lotto.util;

import com.mobliefactory.lotto.DAO.ILottonumber;
import com.mobliefactory.lotto.DTO.LottoRegister;
import com.mobliefactory.lotto.DTO.Lottonumber;
import com.mobliefactory.lotto.service.PhoneService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Component
public class EventEndFunction {
    private final ILottonumber il;
    private final PhoneService ps;
    @Autowired
    public EventEndFunction(ILottonumber il, PhoneService ps) {
        this.il = il;
        this.ps = ps;
    }

    @PostConstruct
    public  void runTask(){
        LocalDateTime announceEventEndTime = LocalDateTime.of(2025,4,16,0,0,0);
        Date date = Date.from(announceEventEndTime.atZone(ZoneId.systemDefault()).toInstant());
        Timer timer = new Timer();
        Lottonumber firstNumber = il.getLotto(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ArrayList<LottoRegister> lottoRegisters = il.getLottoRegisterList();
                //문자 메세지 보내기
                for(LottoRegister lottoRegister : lottoRegisters){
                    //로또 조회
                    Lottonumber lottonumber=il.getLotto(lottoRegister.getLottoseq());
                    String text="";
                    if(lottonumber.getRank() > 55){
                        text+="아쉽게도 낙첨되셨습니다.\n";
                    }else{
                        text+=lottonumber.getRank()+"등에 당첨되셨습니다!\n";
                    }
                    text+="1등 : "+ firstNumber.getNumber();
                    text+="\n로또 번호 : "+lottonumber.getNumber();
                    System.out.println(text);
                    ps.sendSMS(lottoRegister.getPhoneNumber(),"담청결과\n"+text);
                }
                il.allRegisterUpdate();
            }
        },date);
    }
}
