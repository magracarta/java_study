package generic.test.ex4;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Cat>checkup(cat);

        Dog targetDog = new Dog("멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);

        System.out.println("bigget = " + bigger);
    }
}
