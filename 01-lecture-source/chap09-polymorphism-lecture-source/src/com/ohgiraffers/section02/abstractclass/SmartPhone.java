package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product /*, java.util.Scanner*/ {
    //두개의 객체는 상속 받을수없다.
    public SmartPhone(){

    }
    @Override
    public void absMethod() {
        //추상화 abstract 한 메소드는 꼭 오버라이딩을 해야한다.
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
