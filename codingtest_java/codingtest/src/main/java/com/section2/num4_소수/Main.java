package com.section2.num4_소수;

import java.util.Scanner;

public class Main {
    public int solution(int num){
        int answer = 0;
        int [] ch = new int[num+1];
        for(int i = 2; i <= num; i++){
            if(ch[i] == 0){
                answer++;
                for(int j = i; j <= num; j=j+i) ch[j] = 1;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(main.solution(scanner.nextInt()));
    }
}
