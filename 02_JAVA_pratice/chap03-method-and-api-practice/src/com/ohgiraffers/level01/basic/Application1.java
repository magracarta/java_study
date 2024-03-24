package com.ohgiraffers.level01.basic;
import calculator.Multiple;
import calculator.Plus;

import static calculator.Multiple.divide;

public class Application1 {
    public static void main(String[] args) {
       String text =  Check.checkMethod();
        System.out.println(text);

        Plus plutow = new Plus();
        System.out.println("10과 20의 합 : "+plutow.plus(10,20));

        System.out.println("10과 20의 차 : "+ Minus.minusFn(10,5));

        Multiple muti = new Multiple();
        System.out.println("10과 5의 곱 : " + muti.mutipleFn(10,5));


        int devidenum =divide(10,5);
        System.out.println( "10과 5의 나눈 후 몫 :"+devidenum );


    }
}
