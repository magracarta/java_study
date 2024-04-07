package exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        try (FileWriter  f = new FileWriter("data.txt")){
            // try with resource statement
            f.write("Hello");
            //f.close(); try괄호안에 클로즈가 필요한 작업 수행내용을 적으면
            // 내부적으로colse를 수행한다. 해서 colse를 따로 할필요 없다.
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
