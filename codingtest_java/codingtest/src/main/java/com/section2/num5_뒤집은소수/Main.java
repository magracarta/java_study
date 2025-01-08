package com.section2.num5_뒤집은소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2; i<num/2; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res*10 + t;
                tmp /= 10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int [] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = scanner.nextInt();
        }

        for (int x : main.solution(num , arr)){
            System.out.print(x+ " ");
        }
    }
}
