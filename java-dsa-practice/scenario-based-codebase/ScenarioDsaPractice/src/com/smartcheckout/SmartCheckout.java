package com.smartcheckout;
import java.util.*;

class SmartCheckout {

    Queue<Customer> checkoutQueue = new LinkedList<>();
    HashMap<String, Item> inventory = new HashMap<>();

    // Add customer to queue
    public void addCustomer(Customer customer) {
        checkoutQueue.add(customer);
        System.out.println(customer.name + " joined the queue.");
    }

    // Remove customer after billing
    public void processCustomer() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = checkoutQueue.poll();
        double totalBill = 0;

        for (String itemName : customer.items) {
            if (inventory.containsKey(itemName)) {
                Item item = inventory.get(itemName);

                if (item.stock > 0) {
                    totalBill += item.price;
                    item.stock--; // update stock
                } else {
                    System.out.println(itemName + " is out of stock.");
                }
            } else {
                System.out.println(itemName + " not found.");
            }
        }

        System.out.println(customer.name + "'s Total Bill: $" + totalBill);
    }

    // Add items to inventory
    public void addItem(String name, double price, int stock) {
        inventory.put(name, new Item(price, stock));
    }
}
