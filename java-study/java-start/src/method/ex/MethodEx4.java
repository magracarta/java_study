package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        close:
        while (true){
            System.out.println("-----------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------------");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            int amount;
            switch (choice){
                case 1:
                    System.out.print("입금액을 입력하세요.");
                    amount = sc.nextInt();
                    balance  = depositAmount(amount , balance);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요.");
                    amount = sc.nextInt();
                    balance  = withdrawAmount(amount , balance);
                case 3:
                    System.out.println("현재 잔액: "+ balance + "원");
                    break ;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    break close;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }

        }
    }

    public static int depositAmount(int money , int balance){
        int sum = money + balance;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + sum + "원");
        return sum;
    }

    public static int withdrawAmount(int money , int balance){
        int sum = balance - money;
        if (sum >= 0 ){
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + sum + "원");
            return sum;
        }else{
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다. 현재 잔액" + balance );
            return balance;
        }

    }
}
