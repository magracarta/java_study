package com.section01.test1_FindLetter;

import java.util.Scanner;

public class Main {
    public int solution(String str , char t){
        int answer = 0;
        str = str.toUpperCase(); //str이 모두 대문자
        t = Character.toUpperCase(t); //char를 대문자로 바꾸기
        //System.out.println(str + " : " + t);

//        for(int i = 0 ; i < str.length(); i++){
//          if(str.charAt(i) == t){
//              answer++;
//          }
//        }

        for(char c : str.toCharArray()){
            if(c == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
