package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /* 수업 목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
        /*
        * 매개변수와 리턴값 복합활용
        * 매개변수도 존재하고 리턴값도 존재하는 매소드를 이용하며 간단한 계산기 만들기
        * */

        int first = 30;
        int second = 2;

        Application7 app7 = new Application7();


        System.out.println("두 수를 더한 결과 : "+ app7.plusTwoNum(first, second));
        System.out.println("두 수를 뻰 결과 : "+ app7.minusTowNum(first, second));
        System.out.println("두 수를 곱한 결과 : "+ app7.multipleTowNum(first, second));
        System.out.println("두 수를 나눈 결과 : "+ app7.divideTowNum(first, second));


    }

    public int plusTwoNum(int first, int second){
        int result =  first + second;

        return result;
        //return  first + second;
    }

    public int minusTowNum(int first, int second){
        return first - second;
    }

    public  int multipleTowNum(int first , int second){
        return first * second;
    }
    public  int divideTowNum(int first , int second){
        return first / second;
    }

}
