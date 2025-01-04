package com.section2.num2_보이는학생;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[] nums) {
        int answer = 1;
        int max = nums[0];

        for(int i = 1; i < num; i++){
          if(nums[i] > max){
              answer ++;
              max = nums[i];
          }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(main.solution(num, nums));
    }
}
