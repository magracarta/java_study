package sec1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_4 {
    public static void main(String[] args) {
        /*  수업목표, time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다. */
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(localDate+"T"+timeNow);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);



    }
}
