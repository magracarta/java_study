package generic.test.ex4;

import generic.animall.Aniamll;

public class AnimalMethod {
    public static <T extends Aniamll> void checkup(T t){
        System.out.println("동물 이름 : "+ t.getName());
        System.out.println("동물 크디 : "+ t.getSize());
        t.sound();
    }

    public static <T extends  Aniamll> T bigger(T t1 , T t2){
        return  t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
