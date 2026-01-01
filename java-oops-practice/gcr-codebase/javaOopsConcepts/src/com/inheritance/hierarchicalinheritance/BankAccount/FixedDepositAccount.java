package com.inheritance.hierarchicalinheritance.BankAccount;

public class FixedDepositAccount extends BankAccount{
	//attribute
	private int tenure;
		
	//constructor
	public FixedDepositAccount(int accountNumber, double balance, int tenure) {
		super(accountNumber,balance);
		this.tenure = tenure;
	}
		
	@Override
	void displayBankDetails() {
		super.displayBankDetails();
		System.out.println("Tenure: " + tenure);
		System.out.println();
	}
}
