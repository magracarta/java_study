package generic.test.ex3;

import generic.animall.Cat;
import generic.animall.Dog;

public class AnimallHospitalMainVo {
    public static void main(String[] args) {
        DogHoespital dogHoespital = new DogHoespital();
        CatHoespital catHoespital = new CatHoespital();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("고양이1" , 300);

        //개 병원
        dogHoespital.set(dog);
        dogHoespital.checkup();

        //고양이 병원
        catHoespital.set(cat);
        catHoespital.checkup();

        //문제1:  개 병원에 고양이 전달
        //dogHoespital.set(cat); //다른 타입을 입력: 컴파일 오류

        //문제2: 개 타입 반환
        dogHoespital.set(dog);
        Dog biggerDog = dogHoespital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = "+ biggerDog);


    }
}
