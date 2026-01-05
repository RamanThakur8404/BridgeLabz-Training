package com.datastructure.linkedlist.singly.inventorymanagementsystem;

public class Inventory {
	protected String itemName;
	protected int itemId;
	protected int quantity;
	protected double price ;
	Inventory next ;
	
	public Inventory(int itemId, String itemName, int quantity, double price) {
		this.itemName = itemName;
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
}
