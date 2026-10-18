package collection.link;


public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        System.out.println("데이터 추가 ==");
        System.out.println(stringList);

        //마지막에 추가 O(n)
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);
        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);

    }
}
