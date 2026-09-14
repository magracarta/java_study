package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(11);
        System.out.println("integerBox = " + integerBox.get());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        System.out.println("stringBox = " + stringBox.get());

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(11.1);
        System.out.println("doubleBox = " + doubleBox.get());

        //타입 추론 : 제네릭 타입 생략가능

    }

}
