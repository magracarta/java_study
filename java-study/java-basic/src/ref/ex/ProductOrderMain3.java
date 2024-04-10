package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요. : ");
        int n = sc.nextInt();
        sc.nextLine();


        // 총 결제 금액 출력
        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"상품 명을 입력하세요.");
            System.out.print("상품명 : ");
            String productName = sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드
            orders[i] =crateOder(productName,price,quantity);
        }


        printOrder(orders);
        int totalAmount = getTotalAmount(orders);  //ctrl + alt + v;

        System.out.println(totalAmount);

    }

    static ProductOrder crateOder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : "+ order.productName + ", 가격 : "+order.price + ", 수량 : "+ order.quantity);

        }
    }


    static int getTotalAmount (ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }



}
