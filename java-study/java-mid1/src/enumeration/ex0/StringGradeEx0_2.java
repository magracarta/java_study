package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 : " + vip);

    }
}
