package medistore;

import java.util.Scanner;

public class MediStoreDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to MediStore ===");
        System.out.println("Choose Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");

        int choice = sc.nextInt();

        System.out.print("Enter Medicine Name: ");
        String name = sc.next();

        System.out.print("Enter Price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String expiryDate = sc.next();

        System.out.print("Enter Available Quantity: ");
        int quantity = sc.nextInt();

        Medicine medicine = null;

        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate, quantity);
                break;

            case 2:
                medicine = new Syrup(name, price, expiryDate, quantity);
                break;

            case 3:
                medicine = new Injection(name, price, expiryDate, quantity);
                break;

            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }

        System.out.print("Enter Quantity to Sell: ");
        int sellQty = sc.nextInt();

        double billAmount = medicine.sell(sellQty);

        if (billAmount > 0) {
            System.out.println("\n--- BILL DETAILS ---");
            medicine.costDetails(sellQty);
            System.out.println("Amount to Pay: " + billAmount);
        }

        sc.close();
    }
}
