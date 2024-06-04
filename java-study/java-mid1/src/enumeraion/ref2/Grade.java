package enumeraion.ref2;

public enum Grade {
    BASIC(10) , GOLD(20) , DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price){
        return  price * this.discountPercent /100;
    }
}
