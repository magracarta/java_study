package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHosiptalV1 dogHospital = new AnimalHosiptalV1();
        AnimalHosiptalV1 catHospital = new AnimalHosiptalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐용이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();
        //문제1 : 개 병원에 고양이 전달
         dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        //문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
