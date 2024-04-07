package method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodRerturn1 {
    public static void main(String[] args) {
        boolean rerturn = odd(1);
        System.out.println(rerturn);
        List arr = new ArrayList();

        arr.add(10);
        arr.add("hihi");
        arr.add("8");

        System.out.println(arr);

        sortArr(arr);
        System.out.println(arr);


    }
    public static void sortArr(List arr){
        arr.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
    }


    public static boolean odd(int i){
        return i % 2 == 1 ? true : false;
    }



}
