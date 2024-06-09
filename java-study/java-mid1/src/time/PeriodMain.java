package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);


        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);

        System.out.println("currentDate = " +currentDate);
        System.out.println("plusDate = " +plusDate);


        //기간 차이
        LocalDate startDate = LocalDate.of(2023,1,1);
        LocalDate endDate = LocalDate.of(2023,4,2);


        Period period2 = Period.between(startDate, endDate);

        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        System.out.println("period2 = " + period2);
        System.out.println("기간 : " + period2.getMonths() + "개월 " + period2.getDays() + "일" );


    }
}
