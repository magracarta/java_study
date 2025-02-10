package com.mobliefactory.lotto.util;



import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Repository
public class TimeFn {
    public final LocalDateTime startTime = LocalDateTime.of(2025,2,1,0,0,0);
    public final LocalDateTime endTime = LocalDateTime.of(2025,3,31,23,59,59);
    public final LocalDateTime now = LocalDateTime.now();
    public final LocalDateTime announceStartTime = LocalDateTime.of(2025,4,1,0,0,0);
    public final LocalDateTime announceEneTime = LocalDateTime.of(2025,4,15,23,59,59);
    //발표 기간 : 2025/04/01 ~ 2025/04/15

    public boolean eventTime(){
      return  now.isAfter(startTime)  && now.isBefore(endTime);
    }

    public boolean announceStartTime() {
        return now.isBefore(announceStartTime);
    }


    public boolean announceTime(){
        return now.isAfter(announceStartTime) && now.isBefore(announceEneTime);
    }

    //자정까지 계산하기
    public int calcuTime(){
        LocalDateTime midnight = now.toLocalDate().atTime(12, 59, 59);
        long second = ChronoUnit.SECONDS.between(now, midnight);
        return (int) second;
    }


}
