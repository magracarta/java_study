package com.section01.문자열압축_11;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        StringBuilder answer = new StringBuilder();
        int count = 0;
        char text = str.charAt(0);
        str += " ";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(text != c){
                answer.append(text);
                if(count > 1) answer.append(count);
                count = 1;
            }else{
                count++;
            }
            text = c;
        }
        return answer.toString();
    }

    public static void main(String [] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println(main.solution(sc.nextLine()));
    }
}
