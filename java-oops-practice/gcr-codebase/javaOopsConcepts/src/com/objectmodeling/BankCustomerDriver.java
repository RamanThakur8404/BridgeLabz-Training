package com.objectmodeling;

public class BankCustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Bank
		Bank sbi = new Bank("State Bank of India", "SBIN0000691", "Connaught Place, Delhi");
		Bank hdfc = new Bank("HDFC Bank", "HDFC0001234", "Andheri East, Mumbai");
		Bank icici = new Bank("ICICI Bank", "ICIC0005678", "MG Road, Bengaluru");

		// create customer
		Customer amit = new Customer("Amit Sharma");
		Customer neha = new Customer("Neha Verma");
		Customer rahul = new Customer("Rahul Singh");
		Customer priya = new Customer("Priya Gupta");
		Customer suresh = new Customer("Suresh Kumar");

		// open account in different banks
		sbi.openAccount(amit, 15000, "45872910432");
		amit.viewBalance();
		sbi.openAccount(neha, 22000, "73910584627");
		neha.viewBalance();
		hdfc.openAccount(rahul, 30000, "62098415730");
		rahul.viewBalance();
		hdfc.openAccount(priya, 18000, "89103467258");
		priya.viewBalance();
		icici.openAccount(suresh, 25000, "50731896420");
		suresh.viewBalance();
		
	}

}
