package nested.inner;

public class InnterOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();

        System.out.println("innerClass =" + inner.getClass());

    }
}
