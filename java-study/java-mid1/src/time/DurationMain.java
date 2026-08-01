package time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1,0);
        System.out.println("lt = " + lt);

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간: " + plusTime);

        //시간 차이
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(10,0);
        Duration between = Duration.between(start, end);

        System.out.printf("차이 : %s 초",between.getSeconds());
        System.out.println(" ");
        System.out.printf("근무시간 : %s 시간 %s 분" ,  between.toHours(), between.toMinutesPart());
        System.out.println(" ");
        System.out.printf("근무시간 : %s 시간 %s 분" ,  between.toHours(), between.toMinutes());
    }
}
