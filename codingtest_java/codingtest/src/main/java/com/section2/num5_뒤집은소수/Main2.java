package com.section2.num5_뒤집은소수;

import java.util.Scanner;

public class Main2 {
    public boolean sosu(int num){
        for(int j=2; j<num/2; j++){
            if(num % j == 0)return false;
        }
        return true;
    }

    public String solution(int num , String [] arr){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num; i++){
            arr[i] = new StringBuffer(arr[i]).reverse().toString();
            int number = Integer.parseInt(arr[i]);
            if(number ==1) continue;
            if(sosu(number))sb.append(number).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String [] arr = scanner.nextLine().split(" ");

        System.out.println(main.solution(num , arr));
    }
}