package lang.string.equals;

public class StringequalsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello java";
        System.out.println("리터럴 == 비교 : " + (str4 == str3));
        System.out.println("리터럴 equals 비교 : " + (str4.equals(str3)));

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}
