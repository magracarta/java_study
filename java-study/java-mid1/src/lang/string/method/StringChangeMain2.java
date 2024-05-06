package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
       String strWithSapce = "     Java Programing ";

        System.out.println("소문자로 변환 : "+ strWithSapce.toLowerCase());
        System.out.println("대문자로 변환 : "+ strWithSapce.toUpperCase());


        System.out.println("공백 제거(trim) : '" + strWithSapce.trim() + "'" );
        System.out.println("공백 제거(strip) : '" + strWithSapce.strip() + "'" );
        System.out.println("앞 공백 제거(stripLeading) : '" + strWithSapce.stripLeading() + "'" );
        System.out.println("뒤 공백 제거(stripTrailing) : '" + strWithSapce.stripTrailing() + "'" );

    }
}
