package com.ohgiraffers.section06.singleton;

public class Test {
    private String name = "이름";
    private int price = 1000;
    private static String  brand = "브랜드";

    {
        this.name = "인스턴스변수 이름변경";
        this.price = 1001;
        Test.brand = "인스턴스 변수 브랜드 변경";
        System.out.println("인스턴스 변수 초기화  : "+this.name
                +", "+this.price+", "+Test.brand);
    }

    static {
        Test.brand = "정적 변수 브랜드 변경";
        System.out.println("정적 변수 초기화 : "+Test.brand);
    }

    public Test(){

    }
    public Test(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Test.brand = brand;
        System.out.println("생성자 변수 초기화  : "+this.name
                +", "+this.price+", "+Test.brand);
    }




}
