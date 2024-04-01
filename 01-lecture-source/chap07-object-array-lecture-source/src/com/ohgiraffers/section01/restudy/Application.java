package com.ohgiraffers.section01.restudy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
         * 시스템 요구사항
         * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
         * 2. 전체 회원 조회 시 여러 명의 회원 정보 반환
         * */
        /*
        * 제약사항
        * 1. MemberRepository 에서 static 필드로 회원 정보를 관리한다.
        * 2. 회원 정보는 최대 10명까지 저장가능
        * */

        Scanner sc= new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true){
            System.out.println("============화원관리 프로그램 ===============");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: //회원등록
                    memberService.signUpMember();
                    break;
                case 2: //회원 전체 조회
                    memberService.showAllMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입려하였습니다.");
                    break;
            }
        }
    }
}
