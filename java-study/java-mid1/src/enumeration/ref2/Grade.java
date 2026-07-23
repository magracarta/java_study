package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discpountPercent;

    Grade(int discpountPercent) {
        this.discpountPercent = discpountPercent;
    }

    public int getDiscpountPercent() {
        return discpountPercent;
    }

    //추가
    public int discount(int price){
        return price * discpountPercent;
    }
}
