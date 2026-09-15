package generic.test.ex2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String, Boolean> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        pair1.setThird(true);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println("pair1 = " + pair1);
        Pair<String, String , String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSecond("value");
        pair2.setThird("333");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("pair2 = " + pair2);


    }
}
