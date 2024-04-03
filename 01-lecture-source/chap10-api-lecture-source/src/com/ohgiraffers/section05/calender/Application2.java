package com.ohgiraffers.section05.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /* java.util.Calender 클래스를 사용법으로 이해하고 사용할 수 있다. */
        /*
         * API문서를 살펴보면 Calender클래스는 abstract클래스로 작성되어있다.
         * 따라서 Calender 클래스를 이용해서 인스턴스를 생성하는 것이 불가능하다.
         * */

        /* Calender 클래스를 이용한 인스턴스 생성 방법에는 두 가지가 있다.
         * 1. get Instance() static 매소드를 이용해서 인스턴스를 반환받는 방법
         * 2. 후손 클래스에 GregorianCalender 클래스를 이용하여 인스턴스를 생성하는 방법
         * */

        /* 1. get Instance() static 매소드를 이용해서 인스턴스를 반환받는 방법 */
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);



        /* 2. 후손 클래스에 GregorianCalender 클래스를 이용하여 인스턴스를 생성하는 방법 */
        Calendar gregorianCalendar = new GregorianCalendar();

        System.out.println("gregorianCalendar = " + gregorianCalendar);

        int year = 2014;
        int month = 8; //0~11월로 사용하기 때문에 8은 9월을 의미한다.
        int dayOfMonth = 18;
        int hour = 16;
        int min = 42;
        int second = 0;

        //1970년 기준으로 시간을 계산 getTimeMillons
        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth,hour,min,second);
        System.out.println("birthDay.getTime() = " + birthDay);
        System.out.println("birthDay.getTime() = " + birthDay.getTime());



    }

}
