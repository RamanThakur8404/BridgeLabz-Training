package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
	//attribute
	protected int maxSpeed;
	protected String model;
	
	// constructor
	public Vehicle(String model,int maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	 void displayDetails() {
		System.out.println("Model: " + model);
		System.out.println("Max Speed: " + maxSpeed + "km/h");
	}
}
