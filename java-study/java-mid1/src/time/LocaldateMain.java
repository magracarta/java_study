package time;

import java.time.LocalDate;

public class LocaldateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,3,28);
        System.out.println("오늘날짜 = "+nowDate);
        System.out.println("지정날짜 = "+ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정날짜 + 10 = "+ofDate);
    }
}
