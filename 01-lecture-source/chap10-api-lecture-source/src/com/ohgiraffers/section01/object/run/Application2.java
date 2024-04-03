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

        System.out.println(str1.compareTo(str2));


        /* trim() :  문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "  java  "; //앞 뒤 공백 3칸
        System.out.println("trimStr = #" + trimStr+"#");
        System.out.println("trimStr = #" + trimStr.trim()+"#");

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        *  */

        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : "+ caseStr.toLowerCase());
        System.out.println("toUpperCase() : "+ caseStr.toUpperCase());

        /*
        * substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * 앞자리 인데스부터 뒷자리 인덱스 전까지
        *  */

        String javaoracle = "javaoracle";
        System.out.println("substring(3, 6) :" + javaoracle.substring(3,6));
        System.out.println("substring(3) : " + javaoracle.substring(3));

        System.out.println("javaoracle : "+ javaoracle);

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다. */
        System.out.println("replace() : " + javaoracle.replace("java","phthon") );
        System.out.println("javaoracle : "+ javaoracle);

        /* length() : 문자열의 길이를 정수형으로 반환한다. */
        System.out.println("length() : " + javaoracle.length());
        System.out.println("빈 문자열의 길이 "+("".length()));

        /* isEmpty() : 문자열의 길이가 0이면 true를 아니면 flase를 반환 */
        System.out.println("isEmpty() : "+ "".isEmpty()); //true
        System.out.println("isEmpty() : "+ "  ".isEmpty()); //false

        /* 길이가 0인 문자열은 null과는 다르다 */
        String str6 = null;
        String str7 = "";



        Application2 app1 = new Application2();
        app1.stringCapitalUpperCase("dofnviidu");


    }

    public void stringCapitalUpperCase(String str){
        System.out.println("시작-----");
        System.out.println("원래값 : "+ str);
        char firstChar = (str.charAt(0));
        String firstStr =  String.valueOf(firstChar);
        //valueOf  --> char 값을 String으로 바꿔주는
        String uperFirststr = (String)firstStr.toUpperCase();


        String result = str;

        if(!firstStr.equals(uperFirststr)){
           result = uperFirststr +str.substring(1) ;
        }

        System.out.println(result);

    }


}
