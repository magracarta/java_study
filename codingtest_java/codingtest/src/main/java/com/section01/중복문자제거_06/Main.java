package com.section01.중복문자제거_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        ArrayList<Character> charlist = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();

        /*
        for(char character : str.toCharArray() ){
            if( !charlist.contains(character)){
                charlist.add(character);
                sb.append(character);
            }
        }
         */

        for(int i =0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.solution(sc.nextLine()));
    }
}
