package budgetwise;

public class AnnualBudget extends Budget{
	public AnnualBudget(double income, double limit, String[] categories) {
		super(income,limit,categories);
	}
	
	@Override
	public void generateReport() {
		System.out.println("Annual Budget Report");
		System.out.println("Net Savings: " +  calculateNetSaving());
	}
	
	@Override
	public String detectOverSpend() {
		 if (calculateTotalExpenses() > getLimit()) {
	            return "Monthly Overspending Detected!";
	        }
		 else {
	            return "Monthly spending within limit.";
	        }
	}
}
