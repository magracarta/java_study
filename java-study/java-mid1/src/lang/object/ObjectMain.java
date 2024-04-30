package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child();
        child.childMethod();
        child.parentMethod();

        System.out.println(child.test.equals(child2.test));

        //string의 Object 클래스의 메서드이다.
        String string = child.toString();
        System.out.println(string);
    }
}