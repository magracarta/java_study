package com.ohgiraffers.section4.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; //날짜가 나오는 함수

    /*
    * 생성자의 작성 위치
    * 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
    * */

    /*
     *  생성자의 사용 목적
     *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
     *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
     *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
     *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다. (초기값 전달 강제화)
     * */

    /*
     *  생성자 작성 방법
     *  [표현식]
     *  접근제한자 클래스명(매개변수) {
     *      인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
     *      this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     *  }
     * */

    public User(String id, String pwd, String name ){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public void printUser(){
        System.out.println("id은 "+ this.id + "이고 비밀번호는 "+this.pwd+"이고 이름은 "+this.name +"입니다. ");
    }



}
