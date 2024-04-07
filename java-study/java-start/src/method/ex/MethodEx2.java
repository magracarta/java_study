package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello World!";
        printMessege(3,message);
        printMessege(5,message);
        printMessege(7,message);

    }

    public static void printMessege (int count, String message){
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
