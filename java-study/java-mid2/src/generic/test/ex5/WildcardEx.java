package generic.test.ex5;

import generic.animall.Aniamll;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box){

        System.out.println("T = " + box.get());
    }
    static <T extends Aniamll> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Aniamll> T printAndReturnGenericV3(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return  t;
    }
}
