package section03;

public interface InterProduct {

    //추상화 클래스랑 달리 final 상수를 표기해줘야하고 반드시
    //선언과 동시에 초기화 해주어야한다.
    public static final int MAX_NUM = 100;
    public int c = 2;

    public abstract void nonStaticMehod();


    void test ();
    //리턴값을 가지는 함수는 절대불가
    public  void test1();

    public static void test2(){
        System.out.println("신기하게도 static 메소드는 작성가능");
    }
    public default void test3(){
        System.out.println("신기하게도 default 메소드도 작성가능!");
    }
}
