package generic.test.ex3;

import generic.animall.Cat;
import generic.animall.Dog;

public class AnimallHospiterMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHoespital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHoespital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>();//컴파일 오류

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("고양이1" , 300);

        //개 병원
        dogHoespital.set(dog);
        dogHoespital.checkup();

        //고양이 병원
        catHoespital.set(cat);
        catHoespital.checkup();

        //문제1:  개 병원에 고양이 전달
        //dogHoespital.set(cat); //다른 타입 입력: 컴파일 오류

        //문제2: 개 타입 반환
        dogHoespital.set(dog);
        //dogHoespital.set(cat); //다운 캐스팅 오류
        Dog aniamll = dogHoespital.bigger(new Dog("멍멍이2", 200));
        System.out.println("Dog = "+ aniamll);
    }
}
