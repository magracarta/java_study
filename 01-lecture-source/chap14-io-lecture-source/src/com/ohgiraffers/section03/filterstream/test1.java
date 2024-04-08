package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class test1 {
    public static void main(String[] args) {
        //파일 경로 지정
        String filePath = "src/com/ohgiraffers/section03/filterstream/example.txt";
        
        //BufferedReader 객체를 사용하여 콘솔로부터 입력받음
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new FileWriter(filePath));

            System.out.println("텍스트를 입력하세요 ('종료'를 입력하면 프로그램이 종료됩니다.) : ");

            //사용자가 '종료'를 입력할 때까지 반복
            String inputLine;
            while ((inputLine = reader.readLine()) != null ){
                if("종료".equals(inputLine)){
                    break;
                }
                writer.write(inputLine);
                writer.newLine();
            }

            writer.flush();
            System.out.println("파일 쓰기 완료");
            FileReader fileRead =new FileReader(filePath);
            char[] value = new char[(int) new File(filePath).length()];
            fileRead.read(value);
            for(int i =0; i < value.length; i++){
                if(value[i] > 0 ){
                    System.out.print(value[i]);
                }
            }

            /*int value;
            while ((value = fileRead.read()) > -1 ){
                System.out.print((char) value);

            }*/

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(writer != null || reader != null){
                try {
                    reader.close();
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        
    }
}
