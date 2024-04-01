package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    /* 상속으로 인한 불필요한 기능추가 및 새로운 기능추가
    -> 상속을 받아도 모두 새로 쓰기 때문에 막 사용하면 안된다. */
    public RacingCar(){
        System.out.println("RacingCar 클래스 기본 생성자 호출됨 ");
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다!!!!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱 카는 경적을 울리지 않습니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
