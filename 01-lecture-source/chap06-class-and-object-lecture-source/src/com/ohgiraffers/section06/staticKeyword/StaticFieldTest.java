package com.ohgiraffers.section06.staticKeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public static int getStaticCount(){
        return StaticFieldTest.staticCount;
    }


    public int getNonStaticCount(){
        return this.nonStaticCount;
    }

    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }


    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;
    }


}
