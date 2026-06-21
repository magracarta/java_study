package lang.string;

public class stringBasicMain {
    public static void main(String[] args) {

        String str1= "hello";
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);


        String a  = "hello";
        String b = "java";

        String result = a.concat(b);

        System.out.println(result);
    }
}
