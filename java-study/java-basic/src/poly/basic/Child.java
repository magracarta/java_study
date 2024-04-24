package poly.basic;

public class Child extends Parent {
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
    @Override
    public void print (){
        System.out.println("자식의 내용입니다.");
    }
}
