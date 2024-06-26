package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
        * java.io 패키지의 입출력 스트림은 기본 스트림과 필터 스트림으로 분류할 수 있다.
        * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
        * 필터 스트림을 외부 데이터에 직업 연결 되는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
        * 주로 성능을 향상시키는 목적으로 사용한다.
        * */

        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filterstream/testBuffered.tst"));
            bw.write("안녕하세요. \n");
            bw.write("안녕하세요. 반갑습니다. \n");

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedWriter bw2 = null;
        try{
            bw2 = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filterstream/testBuffered.tst2"));
            Scanner sc = new Scanner(System.in);
            bw2.write(sc.nextLine());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bw2 != null){
                try {
                    bw2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
