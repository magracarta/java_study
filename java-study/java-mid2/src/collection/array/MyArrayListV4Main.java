package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrrayListV4<String> stringLsit =new MyArrrayListV4<>();

        stringLsit.add("a");
        stringLsit.add("b");
        stringLsit.add("c");
        String string = stringLsit.get(0);
        System.out.println("ring = " + string);
        MyArrrayListV4<Integer> intlist = new MyArrrayListV4<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);
        Integer integer = intlist.get(0);
        System.out.println("integer = " + integer);
    }
}
