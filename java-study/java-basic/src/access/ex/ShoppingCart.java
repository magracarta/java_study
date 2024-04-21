package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;

    }

    public void displayItems() {
        int itemsTotalPrice =0;
        for(int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 힙계 : " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격의 합 : " + calcTotalPrice());
    }

    private  int calcTotalPrice() {
        int totalPrice = 0;
        for(int i =0; i < itemCount; i++) {
            Item item =  items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
