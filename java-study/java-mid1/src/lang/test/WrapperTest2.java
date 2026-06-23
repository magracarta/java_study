package lang.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String [] array = {"1.5","2.5","3.0"};
        double value = 0L;
        for (String str : array) {
            value += Double.parseDouble(str);
        }

        System.out.println("sum = " + value);
    }
}
