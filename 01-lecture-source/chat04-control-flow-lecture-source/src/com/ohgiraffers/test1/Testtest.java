package com.ohgiraffers.test1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Testtest {
    public static void main(String[] args) {

        //깊은 복사

        // 1. clone

        int [] arr = {1,3,4,5};

        //int [] copyArr = arr.clone();
        //int[] copyArr = new int[8];
        //System.arraycopy(arr, 2, copyArr,0,arr.length-2);

        int[] copyArr = Arrays.copyOf(arr,8);


        System.out.println(copyArr.hashCode());
        System.out.println(arr.hashCode());



        for (int x : arr){
            System.out.print(x + " ");
        }

        System.out.println();

        for (int x : copyArr){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("---------------  정렬 알고리즘  -----------");


        int [] ar = {89,56,21,87,55,44,33,85,31,12};

        for (int x : ar){
            System.out.print(x + " ");
        }

        System.out.println();



        //1. 순차 알고리즘
        /*
        for (int i = 1; i < ar.length; i++){
            for(int j = 0;  j < i; j++){
                if(ar[i] <  ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

         */
        
        //2. 선택 알고리즘
        /*
        int min;
        int temp;
        for(int i = 0; i < ar.length-1; i++){
            min = i;
            for(int j =i+1; j < ar.length; j++){
                if(ar[min] > ar[j]){
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] =  temp;
            for (int x : ar){
                System.out.print(x + " ");
            }

            System.out.println();
        }


         */

        //3. 버블 정렬 알고리즘
        /*
        for(int i = ar.length-1; i >=0; i-- ){
            for(int j = 0; j < i; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1]= temp;
                }
            }

        }

         */


        //4. 삽입 정렬 알고리즘
        int j;
        int temp;

        /*
        for(int  i = 1; i < ar.length; i++){
            temp = ar[i];
            for(j = i-1; j >=0 && ar[j] > temp; j-- ){
                ar[j+1] = ar[j];
            }
            ar[j+1] = temp;


            for (int x : ar){
                System.out.print(x + " ");
            }

            System.out.println();
        }


         */





        for (int x : ar){
            System.out.print(x + " ");
        }

        System.out.println();



    }

}
