package com.ohgiraffers.test1;

import java.util.Scanner;

public class Testtest {
    public static void main(String[] args) {
        int [] ar = {89,56,21,87,55,44,33,85,31,12};

        //순차 알고리즘
        /*
        for(int i =1; i< ar.length; i++){
            for(int j =0; j < i; j++){
                if(ar[j] > ar[i]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

         */

        //선택정렬
        /*
        int min;
        int temp;

        for(int i =0; i < ar.length-1; i++){
            min = i;
            for(int j = i+1; j < ar.length; j++){
                if(ar[min] > ar[j]){
                    min = j;
                }
            }
            temp = ar[min];
            ar[min] = ar[i];
            ar[i] =temp;
        }

         */

       // 삽입 정렬
        /*
        int temp;
        int j =0;

        for(int i =1; i <ar.length; i++ ){
            temp = ar[i];
            for(j = i-1; j >=0 && ar[j] > temp ; j--){
                ar[j+1] = ar[j];
            }
            ar[j+1] = temp;
        }

         */

        //버블 정렬
        /*
        for(int i = ar.length-1; i>0; i--){
            for(int j = 0; j < i; j++){
                if(ar[j] > ar[j+1] ){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }

        }

         */


        // i 가 0인 정렬 : 선택


        for (int x : ar){
            System.out.print(x + " ");
        }

        System.out.println();



    }

}
