package com.section01.특정문자뒤집기_05;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        int lt =0, rt = str.length()-1;
        char[] chars = str.toCharArray();
        while(lt < rt){
//            if((chars[lt] >= 'a' && chars[lt] <= 'z') ||  (chars[lt] >= 'A' && chars[lt] <= 'Z') ){
            if(Character.isAlphabetic(chars[lt])){
//                if( (chars[rt] >= 'a' && chars[rt] <= 'z') ||  (chars[rt] >= 'A' && chars[rt] <= 'Z') ){
                if(Character.isAlphabetic(chars[rt])){
                    char temp = chars[lt];
                    chars[lt] = chars[rt];
                    chars[rt] = temp;
                    lt++;
                    rt--;

                }else rt--;
            }else lt++;
        }
        return String.valueOf(chars);
    }



    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(main.solution(str));
    }
}
