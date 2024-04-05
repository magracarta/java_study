package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복저장을 허용하지 않는다. (null값도 중복되지 않게 하나의 null만 저장한다.)
        *
        * */

        /*
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * JDK 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        *
        * */

        HashSet <String> hSet = new HashSet<>();

        hSet.add("java");
        hSet.add("oracle");
        hSet.add("jabc");
        hSet.add("html");
        hSet.add("css");

        System.out.println("hset = "+ hSet); //넣은 순서대로 들어가지 않음

        hSet.add(new String("java"));
        
        System.out.println("hset = "+ hSet); //중복된 단어는 안들어감
        System.out.println("hset.size() 저장된 객체수 = "+ hSet.size());

        System.out.println("hset = 포함확인 "+ hSet.contains(new String("oracle")));

        /* 안의 객체를 하나씩 뽑을수 없음 */
        /* 해서 반복문으로 하나씩 가져옴 */

        /*1. toArray() 배열로 바꾸고 for loop를 사용*/
        Object[] arr = hSet.toArray(new String[0]);
        for (int i =0; i<arr.length; i++){
            System.out.println(i+". arr[i] = " + arr[i]);
        }

        /* iterator()로 목록을 만들어 연속처리 */
        Iterator<String> iter = hSet.iterator();

        System.out.println("iter.hasNext() = " + iter.hasNext());

        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }

        System.out.println("iter.hasNext() = " + iter.hasNext());

        System.out.println(hSet.isEmpty());
        hSet.clear();
        System.out.println(hSet.isEmpty());


    }
}
