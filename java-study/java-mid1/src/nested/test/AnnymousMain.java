package nested.test;

public class AnnymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello.hello");
            }
        };

        hello.hello();
    }

}
