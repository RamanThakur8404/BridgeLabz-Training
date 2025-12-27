package com.constructor.level1;

public class CarRental {
	//attribute
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double perDayCost = 850;
	
	public CarRental(String customerName, String carModel, int rentalDays) {
		this.customerName  = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	// method to return customer Name
	public String getCustomerName() {
		return customerName;
	}
	
	// method to calculate the total cost
	public double calculateTotalCost() {
		return rentalDays * perDayCost;
	}
}
