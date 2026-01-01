package com.inheritance.hierarchicalinheritance.BankAccount;

public class CheckingAccount extends BankAccount{
	//attribute
	private double withdrawalLimit;
	
	// constructor
	public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	@Override
	void displayBankDetails() {
		super.displayBankDetails();
		System.out.println("Withdrawal Limit: " + withdrawalLimit);
		System.out.println();	
	}
}
