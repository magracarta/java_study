package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        /* 단독 if 문 흐름 확인용 메소드 출력 */
        //a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();

        /* 단독, if-else문 흐름 확인용 메소드 호출 */
        //b.simpeIfElseStatement();

        /* 중첩 if-else 문 흐름 확인용 메소드 호춯  */
        //b.testNeatedIfElseStatment();

        C_ifElseIf c = new C_ifElseIf();
        //c.testSimpleIfElseIfStstement();
        c.testNestedTfElseIfStatment();
    }

}
