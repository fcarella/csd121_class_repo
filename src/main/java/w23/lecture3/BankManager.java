package w23.lecture3;

public class BankManager {
    public static void main(String[] args) {
        BankAccount joesAccount=new BankAccount();
        BankAccount stephsAccount=new BankAccount(4000);
        joesAccount.deposit(1000);
        stephsAccount.deposit(2000);
        joesAccount.withdraw(100);
        stephsAccount.withdraw(1500);

        System.out.println("Joes balance="+ joesAccount.getBalance());
        System.out.println("Stephs balance="+ stephsAccount.getBalance());


    }
}
