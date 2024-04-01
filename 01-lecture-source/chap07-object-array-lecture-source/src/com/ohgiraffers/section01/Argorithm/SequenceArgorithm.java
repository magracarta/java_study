package com.ohgiraffers.section01.Argorithm;

public class SequenceArgorithm extends Argo {
    public int [] sesort = super.getNumAraay().clone();

    public SequenceArgorithm() {

    }

    public SequenceArgorithm(int[] array, String name) {
        super(array, name);
        sequenceMethod();
    }

    public void sequenceMethod(){
        for(int i = 1; i < sesort.length; i++){
            for(int j = 0; j < i; j++){
                if(sesort[i] < sesort[j]){
                    int temp = sesort[i];
                    sesort[i] = sesort[j];
                    sesort[j] = temp;
                }
            }
        }

        for(int x : sesort){
            System.out.print(x+" ");
        }

    }
}
