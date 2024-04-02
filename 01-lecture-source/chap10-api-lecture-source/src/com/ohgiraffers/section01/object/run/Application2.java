package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {
        /* Object 클래스의 equal () 메소드의 오버라이딩 목적을 이해하고 활용할 수 있다. */
        /*
         * equals() 메소드의 오버라이딩
         * equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산을 하여 true와 false를 반환한다.
         * 동일한 인스턴스인지를 비교하는 기능을 한다.
         *
         * 동일객체와 동등객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고한다.
         * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         *
         * */
//
//        String str = new String();
//        String str2 = "String";
//        System.out.println("String".equals(str2));
//        System.out.println(str2 == (str));

        Book book1 = new Book(1, "홍길동전", "허균", 15000);
        Book book2 = new Book(1, "홍길동전", "허균", 15000);

        System.out.println("두 인스턴스의== 연산비교"+(book1 == book2));
        System.out.println("두 인스턴스의 equal()비교 : "+(book1.equals(book2)) );


        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

// 동일 객체 비교(identity)
        System.out.println(str1 == str2); // true (str1과 str2는 동일한 문자열 리터럴을 참조)
        System.out.println(str1 == str3); // false (str1과 str3은 서로 다른 객체를 참조)

// 동등 객체 비교(equality)
        System.out.println(str1.equals(str2)); // true (str1과 str2의 내용은 동일)
        System.out.println(str1.equals(str3)); // true (str1과 str3의 내용은 동일)

    }



}
