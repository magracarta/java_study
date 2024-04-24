package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateCalue;

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod(){
        System.out.println("Parent.defunctMethod");
    }

    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }

    public void printParent(){
        System.out.println("==Parent 메서드 안 ==");
        System.out.println("publicValue: " + publicValue);
        System.out.println("protectedValue: " + protectedValue);
        System.out.println("defaultValue: " + defaultValue);
        System.out.println("privateCalue: " + privateCalue);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }

}
