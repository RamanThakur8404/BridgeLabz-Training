package com.constructor.level1;

public class BankAccountDriver {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("ACC123", "Raman", 5000);
        b1.displayAccountDetails();

        b1.setBalance(6000);
        System.out.println("Updated Balance: " + b1.getBalance());
        System.out.println("");

        SavingAccount s1 = new SavingAccount("ACC456", "Priya", 10000, 5.0);
        s1.displaySavingsDetails();
    }
}
