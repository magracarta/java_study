package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");

        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("3개의 정수를 입력하세요 : ");

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

    }
}
