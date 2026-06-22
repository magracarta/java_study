package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInter  = Integer.valueOf(10);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);


        System.out.println("newInter = " + newInter);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        int intValue = newInter.intValue();
        long longValue = longObj.longValue();

        System.out.println("비교 ==");
        System.out.println("== : "+ (newInter == intValue));
        System.out.println("== : "+ (newInter.equals(intValue)));
        System.out.println(newInter.toString());
    }
}
