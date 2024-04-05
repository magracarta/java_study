package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try { //실행이 무조건
            //et.checkEnoughMoney(20000,30000);
            et.checkEnoughMoney(50000,30000);
            // ㄴ 오류가 있으면 아래코드 는 작동 x
            System.out.println("정상 작동하나?");
        } catch (PriceNegativeException e) { //오류가나면 빠지는 부분
            System.out.println("PriceNegativeException 발생!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (MoneyNegativeException e) { //오류가나면 빠지는 부분
            System.out.println("MoneyNegativeException 발생!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) { //오류가나면 빠지는 부분
            System.out.println("NotEnoughMoneyException 발생!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        } finally {
            /*예외 발생 여부와 상관없이 실행*/
            System.out.println("finally 블럭 내용이 동작함 ");
        }

            System.out.println("프로그램을 종료합니다.");

    }
}
