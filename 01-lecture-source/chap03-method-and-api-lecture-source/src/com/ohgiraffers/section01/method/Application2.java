package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        
        /* 다른 흐름의 메소드 호출 흐름에 대해 이해할 수 있다. */
        /*
        * 1. methodA(), methodB(), methodC()를 차례대로 작성한다.
        * 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 확인하고 다시 현재 위치로 돌아온다.
        * 3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다.
        * */
        System.out.println("main 시작\n");

        /* 4. methodA(), methodB(), methodC()를 차례대로 호출 */
        Application2 app2 = new Application2();
        app2.mehtodA(); //main -> A
        app2.mehtodB(); //main -> B
        app2.mehtodC(); //main -> C

        /* 5. 메인 메소드 종료를 확인하는 출력 구문을 작성한다. */
        System.out.println("\nmain 끝");

        /* 6. 메인을 실행하여 전체적인 소스 흐름을 파악한다. */

        
    }


    public void mehtodA(){
        System.out.println("정규수업 시작함.");
        System.out.println("정규수업 끝남.");
    }

    public void mehtodB(){
        System.out.println("\t취업특강 시작함.");
        System.out.println("\t정규수업 끝남.");
    }

    public void mehtodC(){
        System.out.println("\t\t선생님과 상담하는 날입니다.");
        System.out.println("\t\t선생님과 상담이 끝났습니다.");
    }
}
