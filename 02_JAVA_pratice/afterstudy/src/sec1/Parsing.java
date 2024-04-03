package sec1;

public class Parsing {
    public static void main(String[] args) {
        byte b = Byte.parseByte("1");
        int i = Integer.parseInt("127");
        Parsing p = new Parsing();

        System.out.println(p.typeCheck(b));
        System.out.println(p.typeCheck(i));
    }

    public String typeCheck(int a){
        return a +"는 int입니다.";
    }
    public String typeCheck(byte a){
        return a +"는 byte입니다.";
    }
    public String typeCheck(String a){
        return a +"는 String입니다.";
    }

}
