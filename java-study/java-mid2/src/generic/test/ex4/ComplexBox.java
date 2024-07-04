package generic.test.ex4;

import generic.animall.Aniamll;

public class ComplexBox<T extends Aniamll> {
    private  T animall;
    public void set (T animall){
        this.animall = animall;
    }

    public <T> T printAndReturn(T t){
        System.out.println("animal.className : " + animall.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        return t;
    }
}
