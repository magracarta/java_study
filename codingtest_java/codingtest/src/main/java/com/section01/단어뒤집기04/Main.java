package com.section01.단어뒤집기04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String[] solution(int n , String [] strs){
        String [] answer = new String[n];

        for (int i = 0; i < n; i++){
            char[] s=strs[i].toCharArray();
            int lt =0, rt=strs[i].length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer[i] = String.valueOf(s);
            /*String reverseText = "";
            for(int k =strs[i].length()-1; k >= 0; k--){
                reverseText += strs[i].charAt(k);
            }*/
            answer[i] = new StringBuilder(strs[i]).reverse().toString();
        }

        return  answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] str = new String[n];

        for (int i = 0; i < n; i++) str[i] = sc.nextLine();

        String[] answer = main.solution(n, str);
        for (int i = 0; i < answer.length; i++) System.out.println(answer[i]);



    }


}
