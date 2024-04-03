package com.ohgiraffers.section03.stringbuilder;

import java.util.Locale;

import static java.lang.String.valueOf;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 StringBuilder의 자주 사용되는 메소드의 용법을 확인할 수 있다. */
        StringBuilder sb1 =  new StringBuilder();

        /* capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드(문자열길이 + 16 기본용량) */
        System.out.println("sb1.capacity() = " + sb1.capacity());

        /*
        * append() : 인자로 전달한 값을 문자열로 변환 후 기본 문자의 마지막에 추가한다.
        * 기본용량을 초과하는 경우(기존 문자열 +1) * 2를 하여 용량을 확장시킨다.
        * */
        /*
        for(int i = 0; i < 50; i++) {
            sb1.append(i);

            System.out.println("sb1 : " + sb1);
            System.out.println("capacity : " + sb1.capacity());		//2n + 2씩 증가함
            System.out.println("hashcode : " + sb1.hashCode());		//동일 인스턴스임
        }
        */

        StringBuilder sb2 = new StringBuilder("javaoracle");
        /*
        * delete() : 시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        * deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
        * 둘 다 원본에 영향을 미친다.
        * */

        System.out.println("sb2.delete(2,5) = " + sb2.delete(2,5)); //jaracle
        System.out.println("sb2.deleteCharAt(0) = " + sb2.deleteCharAt(0)); //aracle
        System.out.println("sb2 = " + sb2); //aracle

        /* insert() : 인자로 전달된 값을 문자열로 변환 후 지정된 인덱스 위치에 추가한다. */
        System.out.println("sb2.insert() = " + sb2.insert(1,"vaO")); //avacracle
        System.out.println("sb2.insert() = " + sb2.insert(0,"j"));

        /* 인덱스 번호가 문자열 길이와 같은 경우 append()와 같은 역할을 한다. */
        System.out.println("insert() :  " + sb2.insert(sb2.length(),"jdbc")); // javaOraclejdbc
        System.out.println("sb2 = " + sb2); // javaOraclejdbc

        /*
        * reverse() : 문자열의 인덱스 순번을 역순으로 재배열한다.
        * */

        System.out.println("sb2.reverse() = " + sb2.reverse()); //cbdjelcarOavaj
        System.out.println("sb2 = " + sb2); //cbdjelcarOavaj


        /*
        * String 클래스와 동일한 메소드도 있다.
        * charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
        * */

        StringBuilder testsb = new StringBuilder();
        testsb.append("tesTtTBuiTTldt");


        //t 만 모두 제거 대문자 소문자
        System.out.println( testsb);

//        while (testsb.indexOf("t") >= 0 || testsb.indexOf("T") >= 0){
//          if(testsb.indexOf("t") >= 0){
//              testsb.deleteCharAt(testsb.indexOf("t"));
//          }else if(testsb.indexOf("T") >= 0){
//              testsb.deleteCharAt(testsb.indexOf("T"));
//          }
//            System.out.println("testsb = " + testsb);
//        }

        for(int i = 0; i < testsb.length(); i++){
            String alpabet = valueOf(testsb.charAt(i));
            if(alpabet.equals(alpabet.toUpperCase()) ){
                testsb.deleteCharAt(i);
            }
        }
        System.out.println("testsb = " + testsb);

    }
}
