package generic.ex5;

import generic.animall.Aniamll;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box){

        System.out.println("T = " + box.get());
    }

    static void  printWildCardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Aniamll> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }
    static void printWildCardV2(Box<? extends  Aniamll> box){
        Aniamll animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Aniamll> T printAndReturnGenericV3(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return  t;
    }
    static Aniamll printAndReturnWildV3(Box<? extends  Aniamll> box){
       Aniamll aniaml = box.get();
        System.out.println("이름 = " + aniaml.getName());
        return  aniaml;
    }
}
