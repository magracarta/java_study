package com.ohgiraffers.section01.Argorithm;

public class BubbleArgorithm extends Argo {
    public int [] bArr = super.getNumAraay().clone();
    public BubbleArgorithm() {
    }

    public BubbleArgorithm(int[] array, String name) {
        super(array, name);
        bubbleMethod();
    }

    public void bubbleMethod(){
        for(int i = bArr.length-1; i>=0; i--){
            for(int j = 0; j <i; j++){
                if(bArr[j] > bArr[j+1]){
                    int temp = bArr[j];
                    bArr[j] = bArr[j+1];
                    bArr[j+1] = temp;
                }
            }
        }

        for(int x : bArr){
            System.out.print(x+" ");
        }

    }
}
