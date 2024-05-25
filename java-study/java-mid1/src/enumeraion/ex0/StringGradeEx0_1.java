package enumeraion.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        //존재하지 않는 등급
        discountService.discount("VIP",price);
        int basic = discountService.discount("BASIC" , price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);
    }
}
