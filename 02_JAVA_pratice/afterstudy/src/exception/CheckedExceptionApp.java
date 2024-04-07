package exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
             f = new FileWriter("data.txt"); //fileWirert로 파일을 생성 할때 무조건 닫아주고, IOException을 해줘야한다.
            f.write("Hello");
            //colse를 하기전에 예외가 발생할 수 있기 때문에 finally를 처리해야합니다.

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(f != null){
                try{
                    f.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
