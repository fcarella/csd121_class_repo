package w23.lecture3;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount; // same as balance=balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    private void cleanup(){
        //
    }
}
