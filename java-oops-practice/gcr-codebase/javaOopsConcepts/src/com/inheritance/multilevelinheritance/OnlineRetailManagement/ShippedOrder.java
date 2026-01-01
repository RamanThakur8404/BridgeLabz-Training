package com.inheritance.multilevelinheritance.OnlineRetailManagement;

public class ShippedOrder extends Order{
	// attribute
	protected String trackingNumber;
	
	//constructor
	public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking Number: " + trackingNumber + ")";
    }
}
