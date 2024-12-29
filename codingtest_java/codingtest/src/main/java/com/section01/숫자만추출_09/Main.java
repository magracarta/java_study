package com.section01.숫자만추출_09;

import java.util.Scanner;

public class Main {
    public int solution(String str){
        int answer = 0;
//        str= str.replaceAll("[^0-9]","");
//        answer = Integer.parseInt(str);

        for(char x : str.toCharArray()){
//            if(x >= 48 && x <= 57){
//                answer = (answer*10) + (x - 48);
//            }
            if(Character.isDigit(x)){
                answer = (answer*10) + (x - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println(main.solution(sc.nextLine()));

    }
}
