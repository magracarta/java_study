package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement(){
        /* 수업목표 while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [while문 표현식]
         * 초기식;
         * while(조건식){
         *   조건에 만족하는 경우 수행할 구문(반복할 구문);
         *   증감식;
         * }
         * */

        /* 1부터 10까지 1씩 증가시키면서 10이던 i값을 출력하는 기본 반복문 */
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public void testwhileExample(){
        /* 입력한 문자열에 인덱스를 활용하여 문자 하나씩 출력해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*
        * charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 변환하는 기능
        * length : String 클래스의 메소드로 문자열의 길이를 int 형으로 변환한다.
        * index는 0부터 시작하고 마지막 인덱스는 한상 길이보다 한개 작은 숫자를 가진다.
        * */
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i+":"+ch);
        }

        int index =0;
        while ( index < str.length()){
            char ch = str.charAt(index);
            System.out.println(index+":"+ch);

            index ++;
        }

    }

    public void testWhileExample2(){
        /* 중첩된 while문의 흐름을 이해하고 적용할 수 있다. */
        /* while 문으로 구구단 출력하기 */

        int dan = 2;

        while (dan < 10){
            int su = 1;
            while (su <10){
                System.out.println(dan+"*"+su+"="+dan*su);
                su++;
            }
            System.out.println();
            dan++;
        }

        int a =2;
        int b =1;
        while (a < 10){
            System.out.println(a+"*"+b + "="+a*b);
            a++;
            b++;
        }


    }
}
