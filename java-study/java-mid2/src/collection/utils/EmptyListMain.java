package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());


        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> arr1 = List.of(arr);
        list.set(0,100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("list = " + list);
        System.out.println("arr1 = " + arr1);



    }
}
