package swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Cart with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price (Encapsulation)
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice() * p.getQuantity(); // operators
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            double productTotal = p.getPrice() * p.getQuantity();
            discount += p.getDiscount(productTotal); // polymorphism
        }

        totalPrice = totalPrice - discount;
        System.out.println("Discount Applied: ₹" + discount);
    }

    @Override
    public void generateBill() {
        System.out.println("\n======= SwiftCart Bill ======");

        for (Product p : products) {
            System.out.println(p.getName() + " | Qty: " + p.getQuantity() + " | Price: " + p.getPrice());
        }

        System.out.println("Total Payable: " + totalPrice);
    }
}
