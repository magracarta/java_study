package com.section01.회문문자열_07;

import java.util.Scanner;

public class Main {
    public String solution(String str){

        String reverseString = new StringBuilder(str.toLowerCase()).reverse().toString();

        if(str.equalsIgnoreCase(reverseString)) return "YES";
        else return "NO";

//        String answer = "YES";
//        str = str.toLowerCase();
//        int len = str.length();
//        for (int i = 0; i < len/2; i++) {
//            if(str.charAt(i) != str.charAt(len-1-i)) answer = "NO";
//
//        }


//        return  answer;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(main.solution(scanner.nextLine()));
    }
}
