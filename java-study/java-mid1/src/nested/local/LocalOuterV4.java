package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar =3;
    public Printer process( int paramVar){
        int locarVar = 1; // 지역 변수는 스택 영역이 종료되는 순간 함꼐 제거된다.
        class LocalPrinter implements Printer{

            int value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);
                //인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localvar = " + locarVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //만약 localVar의 값을 변경한다면?
        //locarVar = 10; //컴파일 오류
        //paramVar = 10; //컴파일 오류

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 local = new LocalOuterV4();
        Printer printer = local.process(2);
        //printer.print() 를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields){
            System.out.println("field = " + field);
        }

    }
}
