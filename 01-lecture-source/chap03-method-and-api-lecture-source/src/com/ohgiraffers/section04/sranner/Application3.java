package com.ohgiraffers.section04.sranner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표. 스캐너 사용 시 주의 사항에 대해 이해하고 사용시 주의 사항을 고려하여 사용할 수 있다. */
        /* 스캐너의 next메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        *  그래서 크게 두 가지 사항을 주의해야한다.
        * 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때
        * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 받을 때
        *
        * */

        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때  */
        System.out.print("문자열을 입력해주세요! :  ");
        String str1 =  sc.next();
        System.out.println("str1 = " + str1);

        //sc.nextLine(); // 실수로 next 에 띄어쓰기를 하여도 오류를 안나게 하려면 해당 비어진 nextLine으로
        // 해당 토큰을 소멸시켜 이슈가 없게 해준다. (클리어 기능을 해준다.)

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);


        /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        System.out.println("공백이 있는 문자열 하난 입력해주세요 : ");

        sc.nextLine();  //nextLine을 사용할 경우 한줄을 비워주는것이 중요하다.

        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);


    }
}
