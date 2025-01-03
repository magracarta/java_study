package com.section2.num1_큰수출력하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public ArrayList<Integer> solution(int n , int [] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0);

        for(int i = 1 ; i < n ; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
