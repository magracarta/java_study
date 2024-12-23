package com.section01.문장속단어03;


import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(" ") ) != -1){
            String tmp = str.substring(0, pos);
            if(answer.length() < tmp.length()){
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        //String [] list = str.split(" ");
        /*
        for(String text : list){
            if(answer.length() < text.length()) answer = text;
        }
        */
        return  answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
