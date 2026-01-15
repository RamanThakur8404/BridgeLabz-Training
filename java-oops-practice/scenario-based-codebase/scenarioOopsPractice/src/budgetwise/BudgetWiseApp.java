package budgetwise;
import java.util.Scanner;

public class BudgetWiseApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose Budget Type:\n1.Monthly \n2.Annual");
		int choice = scanner.nextInt();
		
	    System.out.print("Enter income: ");
        double income = scanner.nextDouble();
    
        System.out.print("Enter spending limit: ");
	    double limit = scanner.nextDouble();

	    scanner.nextLine();
	    System.out.print("Enter number of categories: ");
	    int n = scanner.nextInt();
	    scanner.nextLine();

	    String[] categories = new String[n];
	    for (int i = 0; i < n; i++) {
	        System.out.print("Enter category " + (i + 1) + ": ");
	        categories[i] = scanner.nextLine();
	    }

	    Budget budget;
	    switch (choice) {
	    case 1:
	        budget = new MonthlyBudget(income, limit, categories);
	        break;
	    case 2:
	        budget = new AnnualBudget(income, limit, categories);
	        break;
	    default:
	        System.out.println("Invalid choice");
	        return;
	    }

	    System.out.print("Enter number of transactions: ");
	    int tCount = scanner.nextInt();
	    scanner.nextLine();

	    for (int i = 0; i < tCount; i++) {
	        System.out.print("Amount: ");
	        double amt = scanner.nextDouble();
	        scanner.nextLine();

	        System.out.print("Type (income/expense): ");
	        String type = scanner.nextLine();

	        System.out.print("Date: ");
	        String date = scanner.nextLine();

	        System.out.print("Category: ");
	        String cat = scanner.nextLine();

	        budget.addTransaction(new Transaction(amt, type, date, cat));
	    }

	    // Polymorphism in action
	    budget.generateReport();
	    System.out.println(budget.detectOverSpend());

	    scanner.close();
	}
}
