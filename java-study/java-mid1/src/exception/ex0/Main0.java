package exception.ex0;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
        }
    }
}
