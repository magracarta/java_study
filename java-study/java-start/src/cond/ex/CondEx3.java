package cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 10;
        int won = 1300;
        if(dollar < 0){
            System.out.println("잘목된 금액입니다.");
        }else if(dollar==0){
            System.out.println("환전할 금액이 없습니다.");
        }else{
            System.out.println("환전금액은 "+ (dollar*won) + "입니다.");

        }
    }
}
