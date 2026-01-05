package com.datastructure.linkedlist.singly.inventorymanagementsystem;

public class InventoryLinkedList {
	 private Inventory head;

	    // Add at beginning
	    public void addAtBeginning(int id, String name, int qty, double price) {
	        Inventory newItem = new Inventory(id, name, qty, price);
	        newItem.next = head;
	        head = newItem;
	    }

	    // Add at end
	    public void addAtEnd(int id, String name, int qty, double price) {
	        Inventory newItem = new Inventory(id, name, qty, price);
	        if (head == null) {
	            head = newItem;
	            return;
	        }
	        Inventory temp = head;
	        while (temp.next != null)
	            temp = temp.next;
	        temp.next = newItem;
	    }

	    // Add at specific position (1-based index)
	    public void addAtPosition(int pos, int id, String name, int qty, double price) {
	        if (pos == 1) {
	            addAtBeginning(id, name, qty, price);
	            return;
	        }

	        Inventory newItem = new Inventory(id, name, qty, price);
	        Inventory temp = head;

	        for (int i = 1; i < pos - 1 && temp != null; i++)
	            temp = temp.next;

	        if (temp == null) {
	            System.out.println("Invalid position");
	            return;
	        }

	        newItem.next = temp.next;
	        temp.next = newItem;
	    }

	    // Remove by Item ID
	    public void removeByItemId(int id) {
	        if (head == null)
	            return;

	        if (head.getItemId() == id) {
	            head = head.next;
	            System.out.println("Item removed");
	            return;
	        }

	        Inventory temp = head;
	        while (temp.next != null && temp.next.getItemId() != id)
	            temp = temp.next;

	        if (temp.next == null) {
	            System.out.println("Item not found");
	        } else {
	            temp.next = temp.next.next;
	            System.out.println("Item removed");
	        }
	    }

	    // Update quantity by Item ID
	    public void updateQuantity(int id, int newQty) {
	       Inventory temp = head;
	        while (temp != null) {
	            if (temp.getItemId() == id) {
	                temp.quantity = newQty;
	                System.out.println("Quantity updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    // Search by Item ID
	    public void searchById(int id) {
	        Inventory temp = head;
	        while (temp != null) {
	            if (temp.getItemId() == id) {
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    // Search by Item Name
	    public void searchByName(String name) {
	    	Inventory temp = head;
	        boolean found = false;
	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }
	        if (!found)
	            System.out.println("Item not found");
	    }

	    // Calculate total inventory value
	    public void calculateTotalValue() {
	        double total = 0;
	        Inventory temp = head;
	        while (temp != null) {
	            total += temp.price * temp.quantity;
	            temp = temp.next;
	        }
	        System.out.println("Total Inventory Value: ₹" + total);
	    }

	    // Sort by name or price
	    public void sort(String criteria, boolean ascending) {
	        if (head == null)
	            return;

	        for (Inventory i = head; i.next != null; i = i.next) {
	            for (Inventory j = i.next; j != null; j = j.next) {

	                boolean condition = false;

	                if (criteria.equalsIgnoreCase("name")) {
	                    condition = ascending
	                            ? i.itemName.compareToIgnoreCase(j.itemName) > 0
	                            : i.itemName.compareToIgnoreCase(j.itemName) < 0;
	                } else if (criteria.equalsIgnoreCase("price")) {
	                    condition = ascending
	                            ? i.price > j.price
	                            : i.price < j.price;
	                }

	                if (condition) {
	                    swapData(i, j);
	                }
	            }
	        }
	    }

	    private void swapData(Inventory a, Inventory b) {
	        int tempId = a.itemId;
	        String tempName = a.itemName;
	        int tempQty = a.quantity;
	        double tempPrice = a.price;

	        a.itemId = b.itemId;
	        b.itemId = tempId;
	        
	        a.itemName = b.itemName;
	        b.itemName = tempName;

	        a.quantity = b.quantity;
	        b.quantity = tempQty;

	        a.price = b.price;
	        b.price = tempPrice;
	    }

	    // Display inventory
	    public void displayAll() {
	    	Inventory temp = head;
	        if (temp == null) {
	            System.out.println("Inventory is empty");
	            return;
	        }
	        while (temp != null) {
	            displayItem(temp);
	            temp = temp.next;
	        }
	    }

	    private void displayItem(Inventory item) {
	        System.out.println("ID: " + item.itemId +
	                ", Name: " + item.itemName +
	                ", Qty: " + item.quantity +
	                ", Price: ₹" + item.price);
	    }
}
