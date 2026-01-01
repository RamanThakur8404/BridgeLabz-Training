package com.inheritance.multilevelinheritance.OnlineRetailManagement;

public class RetailOrderSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(1001, "01-01-2026");
        System.out.println("Order 1 Status: " + order.getOrderStatus());
        
        Order shippedOrder = new ShippedOrder(1002, "06-01-2026", "TRK12345");
        System.out.println("Order 2 Status: " + shippedOrder.getOrderStatus());
        
        Order deliveredOrder = new DeliveredOrder(1003,"2025-01-03","TRK67890","2025-01-05");
        System.out.println("Order 3 Status: " + deliveredOrder.getOrderStatus());
	}
}
