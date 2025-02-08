package com.mobliefactory.lotto.util;



import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeFn {
    public final LocalDateTime startTime = LocalDateTime.of(2025,02,01,00,00,00);
    public final LocalDateTime endTime = LocalDateTime.of(2025,03,31,00,00,00);
    public final LocalDateTime now = LocalDateTime.now();


    public boolean eventTime(){
      return  now.isAfter(startTime)  && now.isBefore(endTime);
    }

    //자정까지 계산하기
    public int calcuTime(){
        LocalDateTime midnight = now.toLocalDate().atTime(12, 59, 59);
        long second = ChronoUnit.SECONDS.between(now, midnight);
        return (int) second;
    }
}
