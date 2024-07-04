package generic.test.ex4;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 50);

        ComplexBox<Dog> hodpital = new ComplexBox<>();
        hodpital.set(dog);

        Cat returnCat = hodpital.<Cat>printAndReturn(cat);
        System.out.println("returnCat = "+ returnCat);
    }
}
