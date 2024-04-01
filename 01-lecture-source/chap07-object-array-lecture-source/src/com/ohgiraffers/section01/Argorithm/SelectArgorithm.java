package com.ohgiraffers.section01.Argorithm;

public class SelectArgorithm extends Argo {
    public int [] sesort = super.getNumAraay().clone();

    public SelectArgorithm() {

    }

    public SelectArgorithm(int[] array, String name) {
        super(array, name);
        selectMethod();
    }

    public void selectMethod(){
        int min;
        for(int i = 0; i < sesort.length-1; i++){
            min = i;
            for(int j =i+1; j < sesort.length; j++){
                if(sesort[j] < sesort[min]){
                    min = j;
                }
            }
            int temp = sesort[i];
            sesort[i] = sesort[min];
            sesort[min] = temp;
        }


        for(int x : sesort){
            System.out.print(x+" ");
        }

    }
}
