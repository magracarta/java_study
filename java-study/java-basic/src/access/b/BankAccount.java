package access.b;

public class BankAccount {
    private int balance;



    public BankAccount() {
        this.balance = 0;
    }

    //public  메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) balance += amount;
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }

    //public 메서드 : withdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >=0) balance -= amount;
    }
    //public 메소드
    public int getBalance() {
        return balance;
    }
}
