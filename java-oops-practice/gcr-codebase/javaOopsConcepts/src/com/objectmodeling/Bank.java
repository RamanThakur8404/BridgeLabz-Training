package com.objectmodeling;
import java.util.ArrayList;

public class Bank {
	//attribute
	private String bankName;
	private ArrayList<Customer> customers;
	private String ifscCode;
	private String branch;
	
	public Bank(String bankName,String ifscCode,String branch) {
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.bankName = bankName;
		customers = new ArrayList<Customer>();
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public String getIfscCode() {
		return ifscCode;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void openAccount(Customer customer, double balance, String accountNumber) {
		customers.add(customer);
		customer.setBalance(balance);
		customer.setBank(this);
		customer.setAccountNumber(accountNumber);
		
		System.out.println(customer.getName() + " opened an account in " + bankName +" with balance " + balance);
	}
}
