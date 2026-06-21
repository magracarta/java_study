package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 : "+ (str1 == str2));
        System.out.println("new String() equals  비교 : "+ (str1.equals(str2)));

        String str3 ="hello";
        String str4 ="hello";

        System.out.println("리터럴 == 비교" + (str3 == str4));
        System.out.println("리터럴 equals 비교" + (str3.equals( str4)));

        // 문자열 풀에서 같은 값을 사용하기 때문에 String 을 리터럴로 쓸경우
        // 동일성 비교에서도 true 가 나옴.

    }
}
