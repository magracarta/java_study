package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기1
        String result1 ="hello"+"world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String a1 = "string1";
        String a2 = "string2";
        String result2 = a1+a2;
        System.out.println(result2);

        //문자열과 숫자 더하기
        String result3 = "a+b = " + 10; //문자열 + 숫자의 경우는 숫자를 문자열로 바꾸어 출력해버린다.

        System.out.println(result3);

        //문자열과 숫자 더하기2
         int num = 20;
         String str= "a+b = ";
         String result4 = str+num;

        System.out.println(result4);

    }
}
