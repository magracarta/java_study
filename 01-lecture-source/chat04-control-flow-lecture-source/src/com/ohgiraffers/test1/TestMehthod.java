package com.ohgiraffers.test1;

public class TestMehthod {
    public static int[] Calculator(int a , int b){
        int []result = { a+b, a-b, a*b, a/b, a%b};
        return result ;
    }

    public static void CircleArea(double pi, int a ){
        //PI*r*r;
        System.out.println("원의 넓이는 "+(double)(pi*a*a)+ "입니다.");
    }
    public static int testRandom(){
        return (int) (Math.random()*10)+1;
    }
}
