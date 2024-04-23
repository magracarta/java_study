package static2.EX;

public class Car {
    private String name;
    private static int totalCount;

    public Car(){}
    public Car(String name) {
        System.out.println("차량 구입, 이름 : "+name);
        this.name = name;
        totalCount++;
    }

    public static void showTotalCars() {
        System.out.println(totalCount);
    }

}
