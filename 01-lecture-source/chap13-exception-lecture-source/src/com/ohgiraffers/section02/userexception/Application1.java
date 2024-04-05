package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(30000,40000);
            //et.checkEnoughMoney(-50000,10000);
            //et.checkEnoughMoney(50000,-10000);
            et.checkEnoughMoney(50000,-30000);
        } catch (Exception e) {
            //더큰 상위 타입으로 빼서 이게
            // 발생했을때 타고타고 들어가서 메세지를 찍어주겠다.
            e.printStackTrace();
            //순서대로 stack을 찍어주는것 (어디서 어떻게 오류가 났는지 찍어준다는 뜻)

        }
        
        


    }
}
