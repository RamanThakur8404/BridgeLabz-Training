package com.inheritance.hybridinheritance.RestaurantManagementSystem;

public class Waiter extends Person implements Worker{
	//constructor
	public Waiter(String name, int id) {
		super(name,id);
	}
	
	@Override
	public void performDuties(){
		System.out.println("Waiter " + name + " is serving customers.");
	}
}
