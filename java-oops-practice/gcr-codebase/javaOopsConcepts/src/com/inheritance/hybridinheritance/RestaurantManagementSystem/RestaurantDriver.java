package com.inheritance.hybridinheritance.RestaurantManagementSystem;

public class RestaurantDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker chef = new Chef("Amit",101);
		Worker waiter = new Waiter("Roshan",102);
		
		chef.performDuties();
		waiter.performDuties();
	}

}
