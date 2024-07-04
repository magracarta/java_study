package generic.test.ex5;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("고양이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);

        WildcardEx.printWildCardV1(dogBox);
        WildcardEx.printWildCardV2(dogBox);

        Aniamll animal = WildcardEx.printAndReturnWildV3(dogBox);

        Cat cat = WildcardEx.<Cat>printAndReturnGenericV3(catBox);
    }
}
