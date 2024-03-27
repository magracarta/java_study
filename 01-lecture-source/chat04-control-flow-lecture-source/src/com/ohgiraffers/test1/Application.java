package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        byte bnum =1;
        short snum = 1;
        int inum = 1;
        long lnum = 1234L;

        float fnum = 1.25f;
        double dnum = 1.25;

        char ch = 'A';
        String str = "hello worl";

        int sum = inum + (int) lnum;

        String str2 = (sum > 0)? "양수입니다.":(sum ==0)?"0입니다.":"음수입니다.";
        System.out.println(str2);




    }



}
