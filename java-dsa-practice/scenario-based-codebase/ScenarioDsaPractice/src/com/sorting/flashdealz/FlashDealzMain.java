package com.sorting.flashdealz;
import java.util.Scanner;

public class FlashDealzMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Discount (%): ");
            double discount = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, discount);
        }

        FlashDealzSorter.quickSort(products, 0, products.length - 1);

        System.out.println("\n🔥 Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "%");
        }

        sc.close();
    }
}
