package generic.ex5;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
         Box<Object> objBox = new Box<>();
         Box<Aniamll> aniamllBox = new Box<>();
         Box<Dog> dogBox = new Box<>();
         Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(aniamllBox);
        //writeBox(dogBox);
        //writeBox(catBox);

        Aniamll aniamll = aniamllBox.get();
        System.out.println("aniamllBox: " + aniamll);



    }


    static void writeBox(Box<? super Aniamll> box){
        box.set(new Dog("멍멍이" ,100));
    }
}
