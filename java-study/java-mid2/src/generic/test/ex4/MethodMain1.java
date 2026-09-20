package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        //타입인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.genericMethod(i);
        System.out.println(integer);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.numberMethod(i);
        Double aDouble = GenericMethod.<Double>numberMethod(20.0);

    }
}
