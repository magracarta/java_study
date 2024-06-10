package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2014,1,1,0,0,0);
        LocalDateTime updateDate =  date.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println(date);
        System.out.println(updateDate);
    }
}
