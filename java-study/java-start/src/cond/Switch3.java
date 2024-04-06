package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade =2;
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            case 4 -> 4000;
            default -> 500;
        };

        System.out.println(coupon);

        int value = switch (coupon){
            case 1 -> 200;
            case 2 -> 300;
            default -> 500;
        };


    }
}
