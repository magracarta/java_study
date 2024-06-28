package exeption.ex4;

import exeption.ex4.exception.SendExceptionV4;

import java.io.IOException;
import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args){

        //NetworkServiceV3_1 networkSerivce = new NetworkServiceV3_1();
        //NetworkServiceV4 networkSerivce = new NetworkServiceV4();
        NetworkServiceV5 networkSerivce = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            try {
                networkSerivce.sendMessage(input);
            }catch (Exception e){
                //e.printStackTrace();
                exceptionHandelr(e);
             }
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");

    }

    //공통 예외처리
    private static void exceptionHandelr(Exception e) {
        //공통 처리
        System.out.println("사용자 메세지 : 죄송합니다. 알수없는 문제가 발생했습니다.");
        System.out.println("-- 개발자용 디버깅 메시지 --");
        e.printStackTrace(System.out);//스택트레이스
        //e.printStackTrace();

        //필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 : "+sendEx.getMessage());
        }
    }
}
