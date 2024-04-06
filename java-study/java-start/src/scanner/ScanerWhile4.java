package scanner;

import java.util.Scanner;

public class ScanerWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input ;
        while ((input = sc.nextInt()) != -1) {
            System.out.println("입력,");
            System.out.println(input);
        }
    }
}
