package mybankapp;

public class CurrentAccount extends Account{
	private static final double RATE = 1.6;
	
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public CurrentAccount(String accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void calculateInterestRate() {
		double interest = getBalance() * RATE /100;
		setBalance(getBalance() + interest);
		System.out.println("Current Account Interest Added: " + interest);
	}
}
