package day41_Inheritance;

import java.util.function.DoubleBinaryOperator;

/*
WarmUp tasks:
	create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class _1BankAccount {

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public _1BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String firstName, String lastName) {
        accountHolder = firstName + " " + lastName;
    }

    public long getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    //original: 100;
    //deposit: 20;
    //new balance: 120

    public void depositing (int amount) { //method
    //balance += amount;
    setBalance(balance + amount);

    }

    public void withdrawing(int amount) {
            //balance -= amount;
        setBalance(balance-amount);
    }

    public void checkBalance() {
        //System.out.println("Available Balance: " + balance);
        System.out.println("Available Balance: " + getBalance());
    }

    public String toString() {
//        return "Full Name: " + accountHolder + ", available balance: " + balance; //we can use it
        return "Full Name: " + getAccountHolder() + ", available balance: " + getBalance();
    }










}
