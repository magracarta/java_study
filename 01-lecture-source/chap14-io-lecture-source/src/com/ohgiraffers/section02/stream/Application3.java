package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /*
        * FilteOutputStream
        * 프로그램 데이터를 파일로 내보내기를 위한 용도의 스크리이다.
        * 1바이트 단위로 데이터를 처리한다.
        * */

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fos.write(97);
            fos.write(10);
            byte[] bar = new  byte[]{ 98,99,100,101,102,103,104,105 ,10};
            fos.write(bar);
            fos.write(bar , 1, 3); //인덱스 1번부터 3번만큼 내보내기


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try{
                    fos.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
