package com.ohgiraffers.section08.initblock;

public class Product {
    /* 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
 /*
    private String name;
    private int price;
    private static String brand;
  */

    /* 2. 명시적 초기화 */
    private String name ="갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    /* 인스턴스 초기화 블럭 */
    {
        name = "마라탕웨이";
        price = 1200;
        /* 주의사항
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화 할수 있는 거처럼 보인다.
        * 하지만 static 초기화 블럭은 클래스 로드 될 때 이미 기본값으로 초기화를 진해했다.
        * 따라서 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에
        * 인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰기 되는 것이다.
        * */
        System.out.println(brand);
        brand = "탕후루";
        System.out.println("인스턴스 초기화 블럭 동작임..." + brand);
    }
    public Product(){
        System.out.println("기본생성자 호출");
    }


    static { //순서상 제일 먼저 작동
        /* 주의사항
        * static 초기화블럭에서는 non-static필드로 초기화하지 못 한다.
        * 정적 포기화 블럭은 클래스 로드시에 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문이다.
        * 존재하지 않는 인스턴스 변수에 초기화 하는 것은
        * 시기상으로 불가능하다.
        *  */
        //name = "아이뽕";
        //price = 550000;
        System.out.println(brand);
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함..." +brand );

    }
    public Product(String name, int price ) {
        this.name = name;
        this.price = price;
        System.out.println("매개변수 초기화 블럭임");
    }
    public String getInfomation(){

        return "Product [name=" + this.name + ", price=" + this.price + ", brand=" +
                Product.brand+"]";
    }


}
