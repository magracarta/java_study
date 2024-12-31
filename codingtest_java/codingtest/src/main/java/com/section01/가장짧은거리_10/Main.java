package com.section01.가장짧은거리_10;

import java.util.Scanner;

public class Main {
    public int [] solution( String str, char t){
        int [] answer = new int [str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) p =0;
            else p++;
            answer[i] = p;
        }
        p = 1000;
        for(int i = str.length()-1; i >= 0; i--){
            if (str.charAt(i) == t) p =0;
            else p++;
            answer[i] = Math.min(p,answer[i]);
        }

        return answer;
    }

    public static void main(String [] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int [] arr = main.solution(scanner.next(), scanner.next().charAt(0));

        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
