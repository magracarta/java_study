package exeption.ex1;


import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        //NetworkServiceV0_1 networkSerivce = new NetworkServiceV0_1();
        NetworkServiceV0_2 networkSerivce = new NetworkServiceV0_2();
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
