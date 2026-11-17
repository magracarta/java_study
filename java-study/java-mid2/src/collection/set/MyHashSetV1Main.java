package collection.set;

public class MyHashSetV1Main {
    static void main() {
        MyHashSetV1 set = new MyHashSetV1();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // index 중복
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = " + contains);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("set.remove("+searchValue+") = " + removeResult);
        System.out.println(set);
    }
}
