package com.section01.암호_12;

import java.util.Scanner;

public class Main2 {
    public String solution (int num,String s) {
        String answer = "";
        for(int  i = 0; i < num; i++){
            String temp = s.substring(0,7).replace('#','1').replace('*','0');
            int number = Integer.parseInt(temp,2);
            answer += (char)number;
            s = s.substring(7);
        }


        return answer;
    }



    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner scanner = new Scanner(System.in);

        System.out.println(main.solution(Integer.parseInt(scanner.nextLine()),scanner.nextLine()));
    }
}
