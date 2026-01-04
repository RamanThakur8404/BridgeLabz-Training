package mybankapp;

import java.util.Scanner;

public class BankingSystem {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		
		System.out.println("Welcome To MyBank Services");
		
		// Account creation
		System.out.println("Select Account Type:");
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		System.out.println("Enter choice: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Account Number: ");
		String accountNumber = scanner.nextLine();
		
		System.out.print("Do you want to enter opening balance? (yes/no): ");
		String option = scanner.nextLine();

		double openingBalance = 0;
		if (option.equalsIgnoreCase("yes")) {
			System.out.print("Enter Opening Balance: ");
			openingBalance = scanner.nextDouble();
		}

		// Polymorphism
		if (choice == 1) {
			account = option.equalsIgnoreCase("yes") ? new SavingAccount(accountNumber, openingBalance) : new SavingAccount(accountNumber);
		} else if (choice == 2) {
			account = option.equalsIgnoreCase("yes") ? new CurrentAccount(accountNumber, openingBalance) : new CurrentAccount(accountNumber);
		} else {
			System.out.println("Invalid account type.");
			scanner.close();
			return;
		}

		int menuChoice;
		do {
			System.out.println("\n--- MyBank Menu ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Calculate Interest");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				account.deposit(scanner.nextDouble());
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				account.withdraw(scanner.nextDouble());
				break;

			case 3:
				account.checkBalance();
				break;

			case 4:
				account.calculateInterestRate();
				break;

			case 5:
				System.out.println("Thank you for banking with MyBank App!");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (menuChoice != 5);

		scanner.close();
	}
}
