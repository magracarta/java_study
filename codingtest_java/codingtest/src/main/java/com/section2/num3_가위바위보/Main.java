package com.section2.num3_가위바위보;

import java.util.Scanner;

public class Main {
    public String[] something(int num, int[] a, int[] b) {
        String [] answer = new String[num];

        for(int i=0; i<num; i++){
            if(a[i] == b[i]){  answer[i] = "D"; }
            else if(a[i] < b[i]){
                if(a[i] == 1 && b[i] == 3){  answer[i] = "A"; }
                else{  answer[i] = "B"; }
            }
            if(a[i] > b[i]){
                if(a[i] == 3 && b[i] == 1){  answer[i] = "B"; }
                else{  answer[i] = "A"; }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();

        int [] a = new int [num];
        for (int i = 0; i < num; i++) a[i] = scanner.nextInt();
        scanner.nextLine();

        int [] b = new int [num];
        for (int i = 0; i < num; i++) b[i] = scanner.nextInt();

        String [] answer = main.something(num,a,b);
        for(int i=0; i<num; i++){
            System.out.println(answer[i]);
        }
    }
}
