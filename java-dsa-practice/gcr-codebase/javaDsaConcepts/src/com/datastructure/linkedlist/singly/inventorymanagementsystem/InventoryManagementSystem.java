package com.datastructure.linkedlist.singly.inventorymanagementsystem;

public class InventoryManagementSystem {
	 public static void main(String[] args) {
	        InventoryLinkedList inventory = new InventoryLinkedList();

	        inventory.addAtEnd(101, "Laptop", 5, 50000);
	        inventory.addAtBeginning(102, "Mouse", 20, 500);
	        inventory.addAtEnd(103, "Keyboard", 10, 1500);

	        System.out.println("Inventory:");
	        inventory.displayAll();

	        System.out.println("\nSearch by Name:");
	        inventory.searchByName("Mouse");

	        System.out.println("\nUpdate Quantity:");
	        inventory.updateQuantity(101, 7);

	        System.out.println("\nTotal Inventory Value:");
	        inventory.calculateTotalValue();

	        System.out.println("\nSort by Price (Ascending):");
	        inventory.sort("price", true);
	        inventory.displayAll();
	    }
}
