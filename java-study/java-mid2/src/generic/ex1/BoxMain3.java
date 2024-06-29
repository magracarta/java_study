package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); //생성 시점에 T의 타입 결정
        integerBox.set(20);
        System.out.println(integerBox.get()); //Integer타입만 허용, 컴파이 오류
        Integer integer= integerBox.get();

        GenericBox<String> stringBox = new GenericBox<String>();

        stringBox.set("hello");
        String str = stringBox.get();

        System.out.println("str = "+str);

        //원하는 모든 타입 사용가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(2.0);
        System.out.println(doubleGenericBox.get());

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
