package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        // char => byte 러 변경됨 : 예전엔2바이트씩 무조건
        //후엔 영ㅇ어 숫자 1바이트 / 한글 등등2바이트
        System.out.println(str1);
        System.out.println(str2);
    }
}
