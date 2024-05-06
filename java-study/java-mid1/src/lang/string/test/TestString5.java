package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        String filename = str.substring(0,str.indexOf(ext));
        String exname = str.substring(str.indexOf(ext));

        System.out.println(filename);
        System.out.println(exname);

    }
}
