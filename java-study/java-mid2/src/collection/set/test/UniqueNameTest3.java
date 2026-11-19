package collection.set.test;

import java.util.*;

public class UniqueNameTest3 {
    static void main() {

        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));

        for (Integer s : set){
            System.out.println(s);
        }

    }
}
