package sec1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.hashCode());

        localDateTime = LocalDateTime.of(2014,8,20,15,20,20,20);
        System.out.println(localDateTime);
        System.out.println(localDateTime.hashCode());

        LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
        System.out.println(localDateTime2);
        System.out.println(localDateTime2.hashCode());


        System.out.println(localDateTime == localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.minusHours(3);
        System.out.println(localDateTime3);

        System.out.println(localDateTime3.isAfter(localDateTime2));
        System.out.println(localDateTime3.isBefore(localDateTime2));
        System.out.println(localDateTime3.isEqual(localDateTime2));

        String timeNow2 = "14-05-10";
        String dataNow2 = "221005";
        LocalTime dateFomat = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate timeFomat = LocalDate.parse(dataNow2 , DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println("ddd");
        System.out.println("dateFomat : "+dateFomat);
        System.out.println("timeFomat : "+timeFomat);

        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";

//        LocalTime localTime = LocalTime.parse(timeNow);
        LocalTime localTime = LocalTime.now();
//        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDate localDate = LocalDate.now();

        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm ss"));
        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));

        System.out.println(timeFormat);
        System.out.println(dateFormat);


    }


}
