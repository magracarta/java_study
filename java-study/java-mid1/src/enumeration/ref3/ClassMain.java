package enumeration.ref3;



public class ClassMain {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC 등급의 할인 : " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 : " + Grade.DIAMOND.discount(price));
    }
}
