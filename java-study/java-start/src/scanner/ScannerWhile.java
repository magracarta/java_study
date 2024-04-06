package scanner;

import java.util.Scanner;

public class ScannerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.printf("문자열을 입력하세요.(exit : 종료)");
            String text = sc.nextLine();
            if(text.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입려하신 문자는 " + text + " 입니다.");
        }
    }
}
