package budgetwise;

import java.util.ArrayList;

public abstract class Budget implements IAnalyzable{
	private double income;
	private double limit;
	private String[] categoryLimits;
	private ArrayList<Transaction> transactions;
	
	public Budget(double income, double limit, String[] categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<>();
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	protected double calculateTotalExpenses() {
		double total = 0.0;
		for(Transaction t : transactions) {
			if(t.getType().equalsIgnoreCase("expense")) {
				total += t.getAmount();
			}
		}
		return total;	
	}
	
	public double calculateNetSaving() {
		return income - calculateTotalExpenses();
	}

	public double getLimit() {
		return limit;
	}
}

