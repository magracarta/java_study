package com.ohgiraffers.section4.constructor;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */


        /* 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출한다.
        * 생성자 함수에 매개 변수가 없는 생성자를 기본생성자(default Constructor)라고 하며
        * 기본 생성자는 compiler에서 자동으로 추가되기 때문에 지금껏 명시적으로 작성하지 않고 사용할 수 있었다.
        * 인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무것도 작성하지 않은 것이다.
        *  */

        /*
        * 생성자 작성 시 주의할 점
        * 1. 생성자 메소드는 반드시 클래스 이름과 동일해야 한다. 대/소문자까지 같아야한다.
        * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 메소드로 인식한다.)
        * */

        User user= new User("magracarta", "******", "김민주");

        user.printUser();


    }
}
