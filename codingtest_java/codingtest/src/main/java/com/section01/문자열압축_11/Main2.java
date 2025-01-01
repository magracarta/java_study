package com.section01.문자열압축_11;

import java.util.Scanner;

public class Main2 {
    public String solution(String str){
        String answer = "";
        str += " ";
        int cnt = 1;


        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1))cnt++;
            else {
                answer += str.charAt(i);
                if(cnt>1)answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String [] args){
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);

        System.out.println(main.solution(sc.nextLine()));
    }
}
