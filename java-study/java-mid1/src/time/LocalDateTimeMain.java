package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String [] args){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2019, 3, 30, 23, 30, 30);

        System.out.println("현재시간 :"+now);
        System.out.println("지정시간 : "+ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("날짜 분리 : "+localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("시간 분리 : "+localTime);

        //다시 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime = " +localDateTime);

        LocalDateTime ofDtPlusDays = ofDt.plusDays(1000);
        System.out.println("ofDtPlusDays = " +ofDtPlusDays);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println("ofDtPlusYear = " +ofDtPlusYear);


        //비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? "+now.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? "+now.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 와 같은가? "+now.isEqual(ofDt));


    }
}
