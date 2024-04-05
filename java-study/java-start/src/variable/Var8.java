package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127  1byte
        short s = 32767; // -32,768 ~ 32,767  2byte
        int i = 2147483647;//대충 21억 -2,147,483,648 ~ 2,147,486,647 4byte
        long l = 9223372036854775807L; //8byte
        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수
        float f = 10.0f; //4byte
        double d = 10.0; //8byte

        boolean bool = true; //1byte
        char c = 'A';//1byte
        String str = "abc"; //문자열로 메로미 사용량은 문자길이에 따라 동적으로 달라진다.

        String orderDetial;
    }
}
