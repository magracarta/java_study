package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,str.indexOf(".txt"));
        String exname = str.substring(str.indexOf(".txt"), str.length() );

        System.out.println(filename);
        System.out.println(exname);

    }
}
