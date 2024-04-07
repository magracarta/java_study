package exception;

import java.io.FileWriter;
import java.io.IOException;

public class MyException {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("data.txt");
        f.write("뫄뫄 하하하하");
        f.close();
    }
}
