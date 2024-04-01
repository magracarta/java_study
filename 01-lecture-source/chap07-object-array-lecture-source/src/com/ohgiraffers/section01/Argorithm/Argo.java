package com.ohgiraffers.section01.Argorithm;

public class Argo {
    private static int [] numAraay;
    private String name;
   public Argo() {

   }
    public Argo(int [] array, String name) {
        Argo.setNumAraay(array);
        this.name = name;
        this.startMessage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNumAraay(int[] numAraay) {
        Argo.numAraay = numAraay;
    }

    public static int[] getNumAraay() {
        return numAraay;
    }

    public void startMessage(){

 
 
 
        System.out.println(this.name+"알고리즘을 시작합니다.");
    }

}
