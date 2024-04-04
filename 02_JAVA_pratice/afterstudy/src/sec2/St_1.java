package sec2;

import java.util.*;

public class St_1 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add(46.67);


        List list = new ArrayList();
        Collection collection = new ArrayList<>();

        for(int i =0; i< arrayList.size(); i++){
            System.out.println(i+ " : "+ arrayList.get(i));
        }

        System.out.println(arrayList);


        arrayList.add("apple");
        System.out.println("arrayList = "+ arrayList);


        arrayList.set(2, Integer.valueOf(30));
        arrayList.set(0, Boolean.valueOf(true));
        System.out.println("arrayList = "+ arrayList);

        List<String> strings = new ArrayList<>();

        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("grape");
        strings.add("mango");

        System.out.println("strings = " + strings);

        Collections.sort(strings);

        System.out.println("strings = " + strings);



        strings = new LinkedList<>(strings);
        Iterator <String> dIter = ((LinkedList<String>) strings).descendingIterator();

        List<String> decsList = new ArrayList<>();

        while (dIter.hasNext()){
            decsList.add(dIter.next());
        }

        System.out.println("decsList = " + decsList);
        
        





    }

}
