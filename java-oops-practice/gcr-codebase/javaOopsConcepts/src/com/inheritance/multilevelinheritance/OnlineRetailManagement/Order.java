package com.inheritance.multilevelinheritance.OnlineRetailManagement;

public class Order {
	//attribute
	protected int orderId;
	protected String orderDate;
	
	// constructor
	public Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
    public String getOrderStatus() {
        return "Order Placed";
    }
}
