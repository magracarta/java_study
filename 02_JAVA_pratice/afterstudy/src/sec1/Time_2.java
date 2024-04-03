package sec1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time_2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("localTime : "+localTime);
        System.out.println("시간 : "+localTime.getHour());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("zone 정보 : " + zonedDateTime.getZone());
        System.out.println("시차 : " + zonedDateTime.getOffset());



        ZonedDateTime worlTime1 = ZonedDateTime.of(localDateTime.getYear(),localDateTime.getMonthValue(),localDateTime.getDayOfMonth()
                ,localDateTime.getHour(),localDateTime.getMinute(),localDateTime.getSecond(),localDateTime.getNano(), ZoneId.of("America/New_York"));
        System.out.println("worlTime1 : " + worlTime1);
        System.out.println("worlTime1 정보 : " + worlTime1.getZone());
        System.out.println("시차 : " + worlTime1.getOffset());
    }
}
