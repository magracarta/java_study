package sec2;

import java.util.LinkedList;
import java.util.List;

public class St_3 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());
        System.out.println(linkedList);

        for(int i =0; i < linkedList.size(); i++){
            System.out.println(i + " : " + linkedList.get(i));
        }



    }
}
