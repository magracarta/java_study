package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "   Hello Java   ";
        String trimed = original.strip();

        System.out.println("trimed" + trimed);


    }
}
