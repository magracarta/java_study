package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){
        /* 수업목표 문자열 합치기 결과를 예측하고 사용할 수 있다.
         * 목차 1. 두개의 문자열 합치기
         * */

        System.out.println("===========두개의 문자열 합치기");
        System.out.println(9+9);//18
        System.out.println("9"+"9");
        System.out.println("9"+9);
        System.out.println("9"+9);

        /* 목차 2. 세 개의 문자열 합치기 */
        System.out.println("================= 세개의 문자열 합치기========");
        System.out.println("9"+9+9); //999
        System.out.println(9+"9"+9); //999 //왼쪽의 연산부터 수정하고 수행 결과를 오른쪽과 연사함
        System.out.println(9+9+"9"); //189 //왼쪽부터 수행하고 연상방향은 왼쪽에서 오른쪾

        System.out.println("9"+(9+9));

        /* 목차3 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요. */
        System.out.println("================= 10과 20의 사칙 연산 결과========");
        System.out.println(10+20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20);

        System.out.println("===========10과 20의 사칙연산 결과를 보기 좋게 출력 ==========");
        System.out.println("10과 20의 합 : "+ (10 + 20)); //괄호를 묶지 않으면 문자열 합치기가 되어서 결과가 1020이 된다.
        System.out.println("10과 20의 곱 : "+ (10 - 20)); //문자열은 마이너스 연산이 불가능 하기 떄문에 마이너스는 연산이 불가능하다. (반드시 괄호 사용)
        System.out.println("10과 20의 곱 : "+ (10 * 20));
        System.out.println("10과 20의 나누기 : "+ (10 / 20));
        System.out.println("10과 20의 나머지 : "+ (10 % 20));


        System.out.println("======= =======");
        System.out.println("기차"); //기차
        System.out.println("기차"+"칙칙폭폭"); //기차칙칙폭폭
        System.out.println("기차"+123+45+"폭폭"); //기차12345폭폭
        System.out.println(123+45+"기차"+"출발"); //168기차출발




    }
}
