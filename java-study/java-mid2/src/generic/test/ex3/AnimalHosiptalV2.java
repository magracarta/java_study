package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHosiptalV2<T extends Animal> {
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 메서드 정의하는 시점에는 알 수 없음.
        // Object 의 기능만 사용

        System.out.println("동물 이름 : "+animal.getName());
        System.out.println("동물 크기 : "+animal.getSize());
        animal.sound();
    }

    public T bigger(T target){

        return animal.getSize() > target.getSize() ? animal : target;
    }


}
