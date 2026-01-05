package swiftcart;

import java.util.Scanner;

public class SwiftCartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Enter number of products:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter product type (1-Perishable, 2-NonPerishable):");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter category:");
            String category = sc.nextLine();

            System.out.println("Enter price:");
            double price = sc.nextDouble();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();

            Product product;
            if (type == 1) {
                product = new PerishableProduct(name, price, category, qty);
            } else {
                product = new NonPerishableProduct(name, price, category, qty);
            }

            cart.addProduct(product);
        }

        cart.applyDiscount();
        cart.generateBill();

        sc.close();
    }
}
