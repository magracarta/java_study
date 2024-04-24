package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        //기본생성자만 있을경우에만 super 생략 가능
        super(10,20);
        System.out.println("Classc 생성자");
    }
}
