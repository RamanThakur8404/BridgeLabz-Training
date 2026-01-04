package mybankapp;

public class SavingAccount extends Account {
	private static final double RATE = 1.6;
	
	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public SavingAccount(String accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void calculateInterestRate() {
		double interest = getBalance() * RATE /100;
		setBalance(getBalance() + interest);
		System.out.println("Saving Account Interest Added: " + interest);
	}
}
