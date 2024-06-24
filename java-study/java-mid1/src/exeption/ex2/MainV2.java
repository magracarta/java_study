package exeption.ex2;


import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetWorkClientExceptionV2 {
        //NetworkServiceV0_1 networkSerivce = new NetworkServiceV0_1();
        NetworkServiceV2_1 networkSerivce = new NetworkServiceV2_1();
        //NetworkServiceV0_3 networkSerivce = new NetworkServiceV0_3();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkSerivce.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");

    }
}
