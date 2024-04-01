package com.ohgiraffers.section01.user;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 객체배열(클래스 자료형 배열)을 매개변수와 리턴값으로 사용할 수 있다. */
        /*
        * 동일한 타입의 여러 개의 인스턴스를 인자로 전달하거나 리턴 받는 경우에도 객체 배열을 이용할 수 있다.
        * */

        /*
        * 시스템 요구사항
        * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보 반환
        * */

        /*
        * 제약사항
        * 1. MemberRepository에서 static 필드로 회원정보를 관리한다.
        * 2. 회원정보는 최대 10명까지 저장할 수 있다.
        * */

        Scanner sc =new Scanner(System.in);

        MemberService memverService = new MemberService();

        while (true){
            System.out.println("=============회원관리 프로그램==============");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 :");
            int no = sc.nextInt();

            switch (no){
                case 1:
                    memverService.signUpMember();
                    break;
                case 2:
                    memverService.showAllMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return; //이 프로그램으로 돌아가겠다.

                default:
                    System.out.println("잘못된 번호를 입려하였습니다.");
                    break;
            }


        }


    }
}
