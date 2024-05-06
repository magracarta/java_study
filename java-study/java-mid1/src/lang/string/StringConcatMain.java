package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a+b; // 참조값끼리는 더하기 안되지만 String은 자바에서 편의상 특별히 연산을 제공한다.

        System.out.println(result1);
        System.out.println(result2);
    }
}
