package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        /* 파일을 읽어올 때 쓰는 보조기능을 하는 클래스 */
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));
            String s;
            /* IOExecption 인풋 아웃풋 인셉션 입출력오류 */
            while ( (s = in.readLine()) != null ){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) { // IOException 의 후손이다.
            e.printStackTrace(); //빨간색으로 나오는 오류를 역순으로 출력
        } catch (IOException e) {
            e.printStackTrace(); //빨간색으로 나오는 오류를 역순으로 출력
        } finally {
            try {
                /*
                * NullPointerException 이 발생한다.
                * null을 참조하는 상태에서 참조 연산자를 사용시 발생하는 예외이다.
                * */
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
