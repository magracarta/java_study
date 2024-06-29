package generic.ex2;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Aniamll aniamll = new Aniamll("동물", 0);
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이",100);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);


        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Aniamll> aniamllBox = new Box<>();
        aniamllBox.set(aniamll);
        Aniamll findAniamll = aniamllBox.get();
        System.out.println("findAniamll = " + findAniamll);

    }
}
