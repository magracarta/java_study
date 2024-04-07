package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자를 입력하세요.");
        int count = sc.nextInt();
        int [] numbers = new int[count];
        int sum = 0;
        double avg;
        System.out.println(count+"개의 정수를 입력하세요.");
        for(int i=0; i<count; i++){
            numbers[i]  = sc.nextInt();
            sum += numbers[i];
        }
        avg = (double) sum /5;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
}
