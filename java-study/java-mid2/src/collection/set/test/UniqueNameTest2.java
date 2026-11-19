package collection.set.test;

import java.util.*;

public class UniqueNameTest2 {
    static void main() {

        Integer[] inputArr = {30,20,20,10,10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 2, 3, 4);
        for (Integer s : set){
            System.out.println(s);
        }

    }
}
