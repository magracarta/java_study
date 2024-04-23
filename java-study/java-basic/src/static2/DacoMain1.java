package static2;

public class DacoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 utils = new DecoUtil1();
        String daco =  utils.daco(s);

        System.out.println("before" + s);
        System.out.println("after" + daco);
        System.out.println("daco-Static : " + DecoUtil2.daco("s"));

    }
}
