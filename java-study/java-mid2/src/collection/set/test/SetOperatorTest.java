package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperatorTest {
    static void main() {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("합집합 = " + union);


        HashSet<Object> interSection = new HashSet<>(set1);
        interSection.retainAll(set2);

        System.out.println("교집합 = " + interSection);

        HashSet<Integer> diffrence = new HashSet<>(set1);
        diffrence.removeAll(set2);
        System.out.println("차집합 = " + diffrence);

    }
}
