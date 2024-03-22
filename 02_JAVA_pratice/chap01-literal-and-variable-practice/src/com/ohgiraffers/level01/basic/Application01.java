package com.ohgiraffers.level01.basic;

public class Application01 {
    public static void main(String[] args) {
        /* Application01
         * 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int num1 = 20;
        int num2 = 30;


        System.out.println("더하기 결과 : "+plus(num1,num2));
        System.out.println("빼기 결과 : "+minus(num1,num2));
        System.out.println("곱하기 결과 : "+multi(num1,num2));
        System.out.println("나누기한 몫 : "+divide(num1,num2));
        System.out.println("나누기한 나머지 : "+last(num1,num2));

    }

    public static int plus(int num1,int num2){
        return num1+num2;
    }
    public static int minus(int num1,int num2){
        return num1-num2;
    }
    public static int multi(int num1,int num2){
        return num1*num2;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }

    public static int last(int num1,int num2){
        return num1%num2;
    }
}
