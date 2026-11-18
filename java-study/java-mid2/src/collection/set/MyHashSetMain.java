package collection.set;

public class MyHashSetMain {
    static void main() {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        //검색
        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("contains("+searchValue+") = " + contains);
    }
}
