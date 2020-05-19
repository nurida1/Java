package day33_CustomClass;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

/*
create a custom class for bank account
    attributes: accountholder, accountnumber, balance
    actions: checkingBalance(), withDraw(amount)-balance get decreased, deposit(amount)-balance get increased.
    -how much do you want to deposit


create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
 */
public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance() {
        System.out.println("Available Balance: " + balance);
    }

    public void withDraw(double amount) {
        System.out.println("Withdrawing $" + amount);

        if (balance <= 0  ) {
            System.out.println("Sorry, you are not able to withdraw money, your balance is: " + balance);
        }

        if (amount > balance) {
                balance -= amount + 35;
                System.out.println("Your balance is: " + balance + ", fee charged: $35");
            } else {
                balance -= amount;
                System.out.println("Balance after withdrawal: " + balance);

            }

        }


    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
    }

    public String toString () {
        String result = "Account holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balance: " + balance;
        return result;
    }
    }





