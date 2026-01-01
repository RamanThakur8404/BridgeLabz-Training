package com.inheritance.hierarchicalinheritance.BankAccount;

public class BankAccount {
//	attribute
	private int accountNumber;
	private double balance;
	
//	constructor
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
// display method
	void displayBankDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account balance: " + balance);		
	}
}
