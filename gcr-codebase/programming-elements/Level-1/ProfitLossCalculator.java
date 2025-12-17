// Create a class ProfitLossCalculator to indicate how to calculate profit and profitPercentage. 
public class ProfitLossCalculator {
	
	public static void main(String []args) {
		
		// Create a variable costPrice and assign value as 129
		double costPrice = 129;
		
		// Create a variable sellingPrice and assign value as 191
		double sellingPrice = 191;
		
		// Create a variable profit to indicate the profit 
		// obtain from the difference of sellingPrice and costPrice 
		double profit = sellingPrice - costPrice;
		
		// Create a variable profitPercentage to indicate the profit precentage
		double profitPercentage =  profit / costPrice * 100 ;
		
		// Display the Cost Price, Selling Price, Profit and Profit Percentage.
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +"\nThe Profit is INR " + profit + " and the profit percentage is " + profitPercentage); 
	}
}	