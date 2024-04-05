package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
        * TreeSet 클래스
        * 데이터가 정렬된 상태로 저장되는 검색 트리의 형태로 요소를 저장한다.
        * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 동작 시간이 매우 빠르다.
        * Set인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태로 유지한다는 것이 다른 점이다.
        *
        * */
        TreeSet<String> test = new TreeSet<>();
        //test = [css, html, java, jdbc, oracle]

        test.add("java");
        test.add("oracle");
        test.add("jdbc");
        test.add("html");
        test.add("css");

        System.out.println("test = " + test);

        /* 상위 타입안에 넣을 수 있다는 것을 확인하기 위해 적음. */
        /*  */
        Set<Integer> lotto = new TreeSet<>();
        //lotto = [16, 21, 27, 32, 33, 44]

        while (lotto.size() < 6){
            lotto.add((int) (Math.random()*45)+1);
        }

        System.out.println("lotto = " + lotto);



    }
}
