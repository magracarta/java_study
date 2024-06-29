package generic.ex2;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Aniamll aniamll = new Aniamll("동물", 0);
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이",100);

        Box<Aniamll> aniamllBox = new Box<>();
        aniamllBox.set(aniamll);
        aniamllBox.set(dog);
        aniamllBox.set(cat);

        System.out.println(aniamllBox.get());
    }
}
