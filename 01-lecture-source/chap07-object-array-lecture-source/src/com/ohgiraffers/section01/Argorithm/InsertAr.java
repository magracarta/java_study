package com.ohgiraffers.section01.Argorithm;

public class InsertAr extends Argo {
    public int [] arr = super.getNumAraay().clone();
    public InsertAr() {
    }

    public InsertAr(int[] array, String name) {
        super(array, name);
        inserMethod();
    }

    public void inserMethod(){
        int temp;
        int j =0;
        for(int i = 1; i < arr.length ; i++){
            temp = arr[i];
            for(j=i-1; j >=0 && arr[j] > temp; i--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
