package com.section2.num1_큰수출력하기;

import java.util.Scanner;

public class Main {
    public String solution(int n , String str){
        StringBuilder answer = new StringBuilder();
        String [] strarray = str.split(" ");
        answer.append(strarray[0]).append(" ");

        for (int i = 0; i < n-1; i++) {
            if(Integer.parseInt(strarray[i]) < Integer.parseInt(strarray[i+1])){
                answer.append(strarray[i+1]).append(" ");
            }
        }

        return answer.toString();

    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println(main.solution(Integer.parseInt(scanner.nextLine()),scanner.nextLine()));
    }
}
