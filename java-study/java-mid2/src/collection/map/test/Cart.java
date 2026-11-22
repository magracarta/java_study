package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int size) {
        int existingQuantity = cartMap.getOrDefault(product,0)+size;
        cartMap.put(product, existingQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            Product product = entry.getKey();
            Integer size = entry.getValue();
            System.out.println("상품 : "+ product + " 수량 : "+ size);
        }
    }

    public void minus(Product product, int size) {
        int existingQuantity = cartMap.getOrDefault(product,0)- size;
        if(existingQuantity <= 0) {
            cartMap.remove(product);
        }else{
            cartMap.put(product, existingQuantity);
        }
    }
    // 코드 작성
    
}
