package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj ob1 = new ImmutableObj(10);

        ImmutableObj ob2 = ob1.add(20);

        System.out.println("ob1 = " + ob1.getValue());
        System.out.println("ob2 = " + ob2.getValue());

    }
}
