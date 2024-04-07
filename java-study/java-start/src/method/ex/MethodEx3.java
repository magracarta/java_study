package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(15000 ,balance);
        balance = withdrawAmount(1000 ,balance);
        balance = withdrawAmount(10000 ,balance);
        balance = withdrawAmount(100000 ,balance);

        System.out.println("최종 잔액: " + balance + "원");
    }
    //입금
    public static int depositAmount(int money , int balance){
        int sum = money + balance;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + sum + "원");
        return sum;
    }
    //출금
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
