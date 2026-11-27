package collection.compare.test;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦️️"),
    CLUB("♣"),
    ;

    private String icon;

    private Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
