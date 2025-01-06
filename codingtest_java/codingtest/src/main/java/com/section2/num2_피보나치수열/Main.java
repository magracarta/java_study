package com.section2.num2_피보나치수열;

import java.util.Scanner;

public class Main {
    public String solution(int num){
        StringBuilder sb = new StringBuilder();
        int before = 0, after = 1 , sum = 0;
        sb.append(after).append(" ");

        for (int i = 0; i < num-1; i++) {
            sum = after+before;
            before = after;
            after = sum;
            sb.append(sum).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(main.solution(num));
    }
}
