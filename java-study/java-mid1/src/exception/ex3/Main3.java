package exception.ex3;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
