package nested.anonymous;

import nested.local.LocalOuterV4;
import nested.local.Printer;

import java.lang.reflect.Field;

public class AnonymousOuter {
    private int outInstanceVar =3;
    public void process(int paramVar){
        int locarVar = 1; // 지역 변수는 스택 영역이 종료되는 순간 함꼐 제거된다.

        Printer printer =  new Printer() {
            @Override
            public void print() {
                int value = 0;
                System.out.println("value = " + value);
                //인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localvar = " + locarVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class= " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);

    }
}
