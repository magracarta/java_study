package com.section01.유효한팰린드롬_08;
import java.util.Scanner;

public class Main {

    public String solution(String str){
        str = str.replaceAll("[^a-zA-Z]","");
        if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.solution(sc.nextLine()));

    }
}
