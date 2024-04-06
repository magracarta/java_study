package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count =1;

        while (count < 11){
            System.out.println( count++);
        }

        for (int count2 =0; count2 < 10; count2++){
            System.out.println(count2+1);
        }
    }
}
