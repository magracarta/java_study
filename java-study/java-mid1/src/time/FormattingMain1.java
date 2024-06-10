package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포멧팅 : 날짜를 문자로
        LocalDate date = LocalDate.of(2024,12,31);
        System.out.println("date = " + date);
        System.out.println(date.getYear() + "년 " + date.getMonthValue() + " 월");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String foramteDate = date.format(formatter);
        System.out.println("날짜와 시간 포멧팅"+foramteDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy년 MM월 dd일");
        String foramteDate2 = date.format(formatter2);

        System.out.println(foramteDate2);

        //파싱 : 문자를 날짜로
        String input = "2030년 01월 01일";
        LocalDate parseDate = LocalDate.parse(input , formatter);

        System.out.println(parseDate);


    }
}
