package com.inheritance.multilevelinheritance.OnlineRetailManagement;

public class DeliveredOrder extends ShippedOrder{
	//attribute
	protected String deliveryDate;
	
	//constructor
	public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	// method to get the status
	public String getOrderStatus() {
		return "Order delivered on " + deliveryDate;
	}
	
}
