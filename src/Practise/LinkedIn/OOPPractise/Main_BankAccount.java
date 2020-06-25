package Practise.LinkedIn.OOPPractise;

public class Main_BankAccount {

    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(4141, 100);
        //System.out.println(myBankAccount.account_balance);
        //we don't have access

        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

    }
}

//Encapsulation - data hiding
//U cannot directly acces the private properties of a class unless you are writing code inside the class itself
//It helps developers better group and organize data
//Developers can easily change code without affecting other parts of a program
