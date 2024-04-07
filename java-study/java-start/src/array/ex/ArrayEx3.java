package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        int [] score = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++){
            System.out.printf("5개의 정수를 입력하세요. : ");
            int num = sc.nextInt();
            score[i] = num;
        }
        System.out.println();

        for (int i = score.length-1; i >= 0 ; i--){
            String and="";
            if(i > 0){
                and=", ";
            }
            System.out.print(score[i] + and);
        }


    }
}
