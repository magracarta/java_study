package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        // 코드 작성
        Map<String , Integer> sumMap =new HashMap<>();

        for(String key : map2.keySet()) {
            if(map1.containsKey(key)) {
                sumMap.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(sumMap);
    }
}
