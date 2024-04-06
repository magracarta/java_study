package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입려하세요 : ");
        int num2 = sc.nextInt();

        int maxNum = num1 > num2 ? num1 : num2;

        if(num1 == num2) System.out.println("두숫자는 같습니다.");
        else System.out.println("더 큰 숫자는 " + maxNum);

    }
}
