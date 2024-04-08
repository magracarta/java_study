package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class test2 {
    public static void main(String[] args) {
        DataOutputStream dout = null;
        String dataPath = "src/com/ohgiraffers/section03/filterstream/score2.txt";

        try {
            dout = new DataOutputStream(new FileOutputStream(dataPath));
            dout.writeUTF("하하하");
            dout.writeInt(20);
            dout.writeUTF("히히히");
            dout.writeInt(10);

            DataInputStream din =null;
            try {
                din = new DataInputStream(new FileInputStream(dataPath));
                while (true){
                    System.out.println(din.readUTF() + ", " + din.readInt());
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }finally {
                if (din != null){
                    din.close();
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.out.println("파일 읽기 완료");
        }
        catch (IOException e) {
            
        }finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
