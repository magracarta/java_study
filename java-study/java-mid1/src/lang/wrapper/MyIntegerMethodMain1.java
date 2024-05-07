package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(5);
        int i3 = myInteger.compareTo(5);
        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);
        System.out.println("i3 = "+i3);

        Integer num = 3;
        System.out.println(num.compareTo(10));
    }
}
