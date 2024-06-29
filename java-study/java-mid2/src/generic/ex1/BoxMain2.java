package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox inteagerBox = new ObjectBox();
        inteagerBox.set(10);
        Integer integer = (Integer) inteagerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);


        //잘못된 타입의 인수 전달시
        inteagerBox.set("문자 100");
        Integer result = (Integer) inteagerBox.get();
        System.out.println(result);
    }
}
