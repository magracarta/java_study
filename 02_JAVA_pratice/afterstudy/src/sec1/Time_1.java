package sec1;

import java.time.LocalTime;

public class Time_1 {
    public static void main(String[] args) {
        /* time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */

        LocalTime imeNow = LocalTime.now();

        System.out.println("imeNow = " + imeNow);

        LocalTime timeOf = LocalTime.of(18,30,0);
        System.out.println("timeOf = " + timeOf);


    }
}
