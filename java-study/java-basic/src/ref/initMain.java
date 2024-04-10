package ref;

public class initMain {
    public static void main(String[] args) {
        IntiData data = new IntiData();
        System.out.println(data.value1); // 초기화 하지 않으면  0으로 나온다.
        System.out.println(data.value2); // 10
    }
}
