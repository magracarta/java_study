package enumeration.ref3;



public class ClassMain_2 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] values = Grade.values();

        for(Grade grade : values) {
            printDiscount(grade,price);
        }
    }

    private static void printDiscount(Grade grade,int price) {
        System.out.println(grade.name()+" 등급의 할인 : "+grade.discount(price));
    }
}
