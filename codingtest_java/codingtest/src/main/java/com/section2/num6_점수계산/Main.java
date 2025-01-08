package com.section2.num6_점수계산;

import java.util.Scanner;

public class Main {
    public int solution (int num, int[] arr){
        int answer = 0 , count = 0;

        for (int x : arr){
            if(x == 0) count =0;
            else count++;
            answer = answer + count;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.solution(num, arr));
    }
}
