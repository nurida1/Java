package day41_Inheritance;

public class _5BankAccount {
    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit (int amount) {
        balance += amount;
    }

    public void showBalance () {
        System.out.println("Your balance is: $" + balance);
    }

    public String toString () {
        return "Account holder: " + accountHolder + ", account number: " + accountNumber + ", balance: " + balance;
    }



}
