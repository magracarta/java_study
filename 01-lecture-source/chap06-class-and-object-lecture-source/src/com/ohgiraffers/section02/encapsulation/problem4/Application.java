package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /* 접근제한자에 대해 이해하고 플드에 접근하지 못하게 강제화할 수 있다. */

        /* 1.private 필드에 직접 접근하여 compite error를 발생 확인 */
        Monster monster1 = new Monster();
        //monster1.kinds = "피카츄"; // 에러발생 - private 접근제한
        //monster1.hp = 200; // 에러발생 - private 접근제한

        /* 2. public 메소드를 이용하여 필드에 간접 접근 */
        monster1.setKinds("피카츄");
        monster1.setHp(200);
        monster1.setGender('암');
        System.out.println("monster1.getInfo() = " + monster1.getInfo());

        /* 캡슐화는 유지보수성을 증가시키기 위해 직접 접근을 제한하고
        * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
        * 클래스 작성시 특별한 목적이 아닌 이상 캡슐화를 기본 원칙으로 사용되고 있다.
        *  */


    }
}
