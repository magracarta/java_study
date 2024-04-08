package com.ohgiraffers.section02.stream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * FileReader
        * FileInputStream과 사용하는 방법이 거의 동일하다.
        * 단 byte 단위가 아니라 character 단위로 읽어드리는 부분이 차이점이다.
        * 따라서 2byte던 3byte던 글자 단위로 읽어오기 떄문에 한글을 정상적으로 읽어올 수있다.
        *
        * */

        FileReader fr = null;
        try{

            fr = new FileReader("src/com/ohgiraffers/section02/stream/testReader.txt");
            int value;

            /* 한번 스트림으로 글을 읽게 되면 다시 글을 읽을 수 없다. */

            /*while ((value = fr.read()) != -1 ){
                System.out.print((char) value);
            }*/


            char[] carr = new char[(int) new File("src/com/ohgiraffers/section02/stream/testReader.txt").length()];
            fr.read(carr);
            for(int i =0; i < carr.length; i++){
                if(carr[i] > 0 ){
                    System.out.print(carr[i]);
                }
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
