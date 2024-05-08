package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);// 미래에 삭제 예정. 대신에 valueOf()를 사용해라
        Integer integerObject = Integer.valueOf(10); //-128~127 자주 사용하는 숫자 값 재사용, 불변
        System.out.println("newInteger = "+newInteger);
        System.out.println("integerObject = "+integerObject);
        Long longObj = Long.valueOf(100);
        Double dobleObj = Double.valueOf(100);

        System.out.println("longObj = "+longObj);
        System.out.println("dobleObj = "+dobleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();

        System.out.println("intValue = "+intValue);
        long longVlaue= longObj.longValue();
        double doubleValue = dobleObj.doubleValue();

        System.out.println("비교");
        System.out.println("== : " +(newInteger == integerObject));
        System.out.println("equals : " +(newInteger.equals(integerObject)));

    }
}
