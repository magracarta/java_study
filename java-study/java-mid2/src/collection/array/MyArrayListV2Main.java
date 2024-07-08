package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrrayListV2 list = new MyArrrayListV2(2);

        System.out.println("==데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        //범위 초과, capacity가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
        list.add("g");
        System.out.println(list);
        list.add("H");
        System.out.println(list);
        list.add("T");
        System.out.println(list);

        list.add("J");
        System.out.println(list);
        list.add("K");
        System.out.println(list);

    }
}
