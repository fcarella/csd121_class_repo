/**
 * This is the BankAcccount class for lecture 3
 */
package w23.lecture3;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance=100;
    }
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }

    /**
     Withdraws money from the bank account<br>- in intellij, generate javadoc from the menu with "Tools/Generate Javadoc", then specify the output directory, in this case C:\Users\fcarella\IdeaProjects\csd121\csd121_class_repo\src\main\java\w23\lecture3\javadoc
     @param amount the amount to withdraw

     */public void withdraw(double amount){
        balance-=amount; // same as balance=balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    private void cleanup(){
        //
    }
}
