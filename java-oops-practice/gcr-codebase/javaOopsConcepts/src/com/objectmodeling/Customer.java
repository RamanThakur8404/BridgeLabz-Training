package com.objectmodeling;

public class Customer {
	private String customerName;
	private String accountNumber;
	private double balance;
	private Bank bank; // association (customer linked to Bank)
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return customerName; 
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void viewBalance() {
		System.out.println(customerName + " bank account in " + bank.getBankName() + " having account balance: " + balance + "\n");
	}
}
