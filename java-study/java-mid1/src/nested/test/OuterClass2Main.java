package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outer2 = new OuterClass2();
        OuterClass2.NestedClass nestedClass =outer2.new NestedClass();
        nestedClass.hello();
    }
}
