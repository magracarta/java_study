package sec1;

import java.time.*;

public class Time_1 {
    public static void main(String[] args) {
        /* time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */

        LocalTime imeNow = LocalTime.now();

        System.out.println("imeNow = " + imeNow);

        LocalTime timeOf = LocalTime.of(18,30,0);
        System.out.println("timeOf = " + timeOf);

        LocalDate datNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2023,1,19);

        System.out.println("datNow = " + datNow);
        System.out.println("dateOf = " + dateOf);



        LocalTime currentTimeInParis = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("The current time in Paris is " + currentTimeInParis);

        LocalTime timeToGoToBed = LocalTime.of(23, 30, 0);
        System.out.println("I go to bed at " + timeToGoToBed);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Europe/Paris"));

        System.out.println(zonedDateTimeNow);
        System.out.println(zonedDateTimeOf);







    }
}
