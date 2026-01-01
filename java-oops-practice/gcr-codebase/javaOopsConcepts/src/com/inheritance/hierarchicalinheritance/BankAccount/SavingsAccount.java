package com.inheritance.hierarchicalinheritance.BankAccount;

public class SavingsAccount extends BankAccount{
	//attribute
	private double interestRate;
	
	//constructor
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	@Override
	void displayBankDetails() {
		super.displayBankDetails();
		System.out.println("Interest Rate: " + interestRate);
		System.out.println();	
	}
}
