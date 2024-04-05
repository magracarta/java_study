package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTesst et = new ExceptionTesst();
        try {
            //et.checkEnoughMoney(50000,10000);
            et.checkEnoughMoney(10000,50000);
            System.out.println("---------상품 구입 가능---------");
        } catch (Exception e) { //예외를 넣은 하단 코드 (예외일 시 작동하는 코드)
            //throw new RuntimeException(e);
            System.out.println("상품 구입 불가능 !!!");
        }
        System.out.println("상품 구입이 종료 됩니다.");
    }
}
