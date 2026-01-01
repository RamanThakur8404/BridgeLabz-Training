package com.inheritance.hierarchicalinheritance.BankAccount;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savings = new SavingsAccount(10001, 50000.0, 4.5);
		BankAccount checking = new CheckingAccount(10002, 25000.0, 10000.0); 
		BankAccount fixedDeposit = new FixedDepositAccount(10003, 100000.0, 24);
		
		savings.displayBankDetails();
		checking.displayBankDetails();
		fixedDeposit.displayBankDetails();
	}

}
