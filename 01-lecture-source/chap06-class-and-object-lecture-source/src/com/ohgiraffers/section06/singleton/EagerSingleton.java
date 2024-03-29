package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    /* 외부에서 인스턴스를 생성하는것을 제한하는 것 */
    private EagerSingleton(){
        if(eager==null){

        }else{
            System.out.println("eager 이미 초기화 됨");
        }
    }
    public static EagerSingleton getInstance(){
        return eager;
    }


}
