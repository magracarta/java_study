package com.section01.대소문자변환문제02;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";

        for(char s : str.toCharArray()){
            if(Character.isUpperCase(s)){
                answer += Character.toLowerCase(s);
            }else answer += Character.toUpperCase(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.print(main.solution(sc.next()));
    }
}
