package com.generics.dynamiconlinemarketplace;
import java.util.Scanner;
public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetsCategory gadgetsCategory = new GadgetsCategory();

        // Prompt the user for product details
        System.out.println("Welcome to the Dynamic Online Marketplace!");
        System.out.print("Enter Product Type (Book/Clothing/Gadget): ");
        String productType = scanner.nextLine().toLowerCase();

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();  // consume the leftover newline

        // Create product based on the category entered by the user
        Product<?> product = null;
        switch (productType) {
            case "book":
                product = new Product<>(productName, productPrice, bookCategory);
                break;
            case "clothing":
                product = new Product<>(productName, productPrice, clothingCategory);
                break;
            case "gadget":
                product = new Product<>(productName, productPrice, gadgetsCategory);
                break;
            default:
                System.out.println("Invalid product type entered. Exiting...");
                scanner.close();
                return;
        }

        System.out.println("\nCreated Product: " + product);

        // Ask for discount input
        System.out.print("Enter Discount Percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Apply discount
        Marketplace.applyDiscount(product, discountPercentage);

        // Print updated product details
        System.out.println("\nUpdated Product: " + product);

        scanner.close();
    }
}