package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a +", b = " + b);

        //후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a +", b = " + b);


    }
}
