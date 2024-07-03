package generic.test.ex3;

import generic.animall.Cat;
import generic.animall.Dog;

public class AnimallHospiterMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHoespital = new AnimalHospitalV1();
        AnimalHospitalV1 catHoespital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("고양이1" , 300);

        //개 병원
        dogHoespital.set(dog);
        dogHoespital.checkup();

        //고양이 병원
        catHoespital.set(cat);
        catHoespital.checkup();

        //문제1:  개 병원에 고양이 전달
        dogHoespital.set(cat); //매게 변수 체크 실패 : 컴파일 오류가 발생하지 않습니다.

        //문제2: 개 타입 반환
        dogHoespital.set(dog);
        //dogHoespital.set(cat); //다운 캐스팅 오류
        Dog aniamll = (Dog) dogHoespital.bigger(new Dog("멍멍이2", 200));
        System.out.println("Dog = "+ aniamll);
    }
}
