package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMehthod;

public class Application {
    public static void main(String[] args) {

        int[] cal = TestMehthod.Calculator(2,5);

        System.out.println("2+5= "+cal[0]);
        System.out.println("2-5= "+cal[1]);
        System.out.println("2*5= "+cal[2]);
        System.out.println("2/5= "+cal[3]);
        System.out.println("2%5= "+cal[4]);

        final double PI = 3.14;
        TestMehthod circleText = new TestMehthod();
        circleText.CircleArea(PI ,4);


        System.out.println(TestMehthod.testRandom());


    }
}
