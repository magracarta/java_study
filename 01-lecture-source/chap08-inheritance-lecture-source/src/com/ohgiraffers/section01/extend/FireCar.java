package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    //상속 object -> Car -> FireCar

    @Override
    protected boolean isRunning() {
        return super.isRunning();
    }

    public FireCar(){
        super();
        //부모의 생성자를 생성하는것 (생략되어져있지만 모두 가지고있음.)
        //자식클래스에서는 명시적으로 작성을 해줘야한다.

        System.out.println("FireCar 클래스의 기본 생성자 호출됨.");

    }

    @Override
    public void soundHorn() {
        //super.soundHorn();
        if(isRunning()){
            System.out.println("빠아아아아아앙!!!!!!!빠아아아아아앙!!!!!");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요 비켜~~~!!!");
        }

    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ====================================");
    }

}
