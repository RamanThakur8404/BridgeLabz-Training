package com.smartcheckout;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 2.5, 10);
        checkout.addItem("Bread", 1.5, 5);
        checkout.addItem("Eggs", 3.0, 12);

        Customer c1 = new Customer("Alice", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Bob", Arrays.asList("Eggs", "Milk"));

        checkout.addCustomer(c1);
        checkout.processCustomer();
        
        checkout.addCustomer(c2);
        checkout.processCustomer();
    }
}
