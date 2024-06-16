package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(int num){
        System.out.println("프로그램 시작");
        //코드 조각 시작
        int randomValue = new Random().nextInt(num) + 1;
        System.out.println("주사위 = " + randomValue);

        //코드 조각 종료
        System.out.println("프로그램 종료");
    }
    public static void helloSum(int num){
        System.out.println("프로그램 시작");
        //코드 조각 시작
        for(int i =1; i <= num; i++){
            System.out.println("i = " + i);
        }

        //코드 조각 종료
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        helloDice(6);
        helloSum(6);
    }
}
