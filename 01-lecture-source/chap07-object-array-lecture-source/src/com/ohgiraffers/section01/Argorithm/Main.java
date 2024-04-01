package com.ohgiraffers.section01.Argorithm;

public class Main {
    public static void main(String[] args) {
        int [] arr = {10,8,20,5,365,7,9,1,44};

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        SequenceArgorithm sr = new SequenceArgorithm(arr, "순차 알고리즘");
        System.out.println();
        SelectArgorithm sa = new SelectArgorithm(arr, "선택알고리즘");
        System.out.println();

        BubbleArgorithm ba = new BubbleArgorithm(arr,"버블 알고리즘");
        System.out.println();
        InsertAr ia = new InsertAr(arr, "삽입알고리즘");

    }
}
