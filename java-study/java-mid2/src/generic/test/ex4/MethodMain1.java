package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;

        Object object = GenericMethod.objMethod(i);
        //Integer result =  (Integer)GenericMethod.objMethod(i);

        //타입인자 (Type Argument)명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);

        GenericMethod.<Double>numberMethod(10.2558);



        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);

    }
}
