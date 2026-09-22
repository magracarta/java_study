package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildCardEx.<Dog>printGenericV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        Dog dog = WildCardEx.printAndReturn(dogBox);

        WildCardEx.printWildCardV1(dogBox);
        WildCardEx.printWildCardV2(catBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
        System.out.println("애니몰"+animal);
    }
}
