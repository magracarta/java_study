package access.a;

public class AccessData {
    public int publicField;
    int defaultFiel;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출"+defaultFiel);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultFiel = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }


}
