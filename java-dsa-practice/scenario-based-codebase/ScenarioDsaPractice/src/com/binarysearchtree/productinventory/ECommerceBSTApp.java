package com.binarysearchtree.productinventory;
import java.util.Scanner;

public class ECommerceBSTApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryBST inventory = new InventoryBST();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        // Insert products
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter product " + (i + 1) + " details:");

            System.out.print("SKU: ");
            int sku = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            inventory.insert(new Product(sku, name, price));
        }

        // 🔹 Scenario 1: Lookup
        System.out.print("\nEnter SKU to search: ");
        int searchSku = sc.nextInt();
        Product found = inventory.search(searchSku);

        if (found != null) {
            System.out.println("Product Found: " + found);
        } else {
            System.out.println("Product not found.");
        }

        // 🔹 Scenario 2: Price Update
        System.out.print("\nEnter SKU to update price: ");
        int updateSku = sc.nextInt();

        System.out.print("Enter new price: ");
        double newPrice = sc.nextDouble();

        inventory.updatePrice(updateSku, newPrice);

        // 🔹 Scenario 3: Sorted SKU Display
        System.out.println("\nProducts Sorted by SKU:");
        inventory.displaySorted();

        sc.close();
    }
}
