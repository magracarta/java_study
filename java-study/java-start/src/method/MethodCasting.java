package method;

public class MethodCasting {
    public static void main(String[] args) {
        double number = 1.5;
        byte n = 10;
        printNumber((int) number);
        printNumber(n);
    }
    public static void printNumber(int number) {
        System.out.println("숫자 : "+ number);
    }

}
