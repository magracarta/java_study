package com.ohgiraffers.section3.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map 인터페이스의 특징
        * collection 인터페이스와 다른 저장방식을 가진다.
        * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        * */

        /*
        * 키(key)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장순서를 유지하지 않는다.
        * 2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.
        * */

        /*
        * HashMap 검색 속도가 매우 빠르다.
        * HasgTable 버전에 따라 사용이 나뉘지만 가급적 map을 사용하자!
        *  */

        /* 인스턴스 생성자에 무언갈 넣지 않아도 괜찮다. 모든 타입을 받을 수 있다. */
        //hMap.put(object kye, object value) 객체만 삽입 가능
        HashMap hMap = new HashMap();
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println("hMap = " + hMap);

        /* 키 값이 같으면 중복저장이 되지 않는다 -> 덮어 쓰기가 됨 */
        hMap.put(12,"바나나");
        System.out.println("hMap = " + hMap);

        /* 키 값이 다르면 벨류 값이 중복되어도 두개모두 저장된다. */
        hMap.put(11,"banana");
        hMap.put(9,"banana");
        System.out.println("hMap = " + hMap);


        /* hMap.get(object key값) 을 넣어주면 안의 벨류 객체값을 가져온다. */
        System.out.println("키 9의 객체 값 = " + hMap.get(9));


        
        /* 키 9번  제거 */
        hMap.remove(9);
        System.out.println("hMap = " + hMap);

        System.out.println("hMap.size() = " + hMap.size());

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one","java");
        hmap2.put("two","oracle");
        hmap2.put("three","jdbc");
        hmap2.put("four","jhtml");
        hmap2.put("five","css");

                                        //반복자에서 키만 따로 빼서 보여주겠다는 의미
        Iterator<String> keyIter = hmap2.keySet().iterator();

        //키에 대한 목록을 만드는 작업
        while (keyIter.hasNext()){
            String key = (String) keyIter.next();
            String valeu = (String) hmap2.get(key);
            System.out.println(key + " = " + valeu);
        }

        Collection<String> values = hmap2.values();
        /* 반복자를 이요한 처리 방법 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());
        }

        /* map을 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i =0; i < valueArr.length; i++){
            System.out.println(i +" valueArr[i] = " +  valueArr[i]);
        }

        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        /* Entry를 가지고 처리하는 법 :  키와 객체를 쌍으로 묶는 것 */
        //반복자를 이용해서 꺼내준다. 내부에 있는 entry set을 이용해서 출력하는 방법
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while (entryIter.hasNext()){
            Map.Entry<String, String> entry  = entryIter.next();
            System.out.println("entry.getKey() = " + entry.getKey() + " : "+ entry.getValue());
        }



    }
}
