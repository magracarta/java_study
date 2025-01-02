package com.section01.암호_12;

import java.util.Scanner;

public class Main {
    public String solution (int num,String s) {
        String [] arr = new String[num];
        for(int  i = 0; i < num; i++){
            arr[i] = s.substring(i*7, i*7+7);
        }
        StringBuffer sb = new StringBuffer();
        for(String a : arr){
            String s1 = a.replaceAll("#", "1").replaceAll("[*]","0");
            sb.append((char) binuryNumber(Integer.parseInt(s1)));
        }

        return sb.toString();
    }

    public int binuryNumber(Integer num){
        int sum = 0, count = 1;
        while(num > 0){
            sum += (num % 10)*count;
            num /= 10;
            count = count * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println(main.solution(Integer.parseInt(scanner.nextLine()),scanner.nextLine()));
    }
}
