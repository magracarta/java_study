package enumeraion.ex3;

import static enumeraion.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC,price);
        int gold = discountService.discount(GOLD,price);
        int diamond = discountService.discount(GOLD,price);

        System.out.println("BASIC 등급의 할인 금액 : "+ basic);
        System.out.println("GOLD 등급의 할인 금액 : "+ gold);
        System.out.println("DIAMONDD 등급의 할인 금액 : "+ diamond);
    }
}
