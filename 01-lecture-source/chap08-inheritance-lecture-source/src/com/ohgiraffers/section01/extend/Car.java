package com.ohgiraffers.section01.extend;

public class Car {
    //public class Car extends Object
    //보통 원래 오브젝트에서 상속받아 기능을 사용하고 있었다.
    private boolean runningStatus;

    public Car(){
        System.out.println("Car 클래스 기본 생성자 호출됨...");

    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵! 빵! ");
        }else{
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    //private boolean isRunning(){
    protected boolean isRunning(){

        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }



}
