package lang.string.method;

public class StringCompareIsonMain {

    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "hello java";
        String str3 = "hello world";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("'b' compareTo 'a' " + "b".compareTo("a"));
        System.out.println("'a' compareTo 'b' : "+ "a".compareTo("b"));

        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello' : "+ str1.startsWith("Hello"));
        System.out.println("str2 end with 'java' : "+ str2.endsWith("Hello"));

    }
}
