package com.ohgiraffers.section06.staticKeyword;

public class StaticMethodTest {
    private  int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출함..."+ count);
    }

    public static void staticMethod(){
        //this.count++;

        System.out.println("StaticMethod 호출함...");
    }

}
