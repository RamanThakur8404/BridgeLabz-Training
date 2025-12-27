package com.constructor.level1;

public class CarRentalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRental rental1 = new CarRental("Akshay Khanna","Defender",3);
		CarRental rental2 = new CarRental("Robin Hood","Tata Harrier",5);
		
		//print the result
		System.out.println("Customer Name: "+rental1.getCustomerName() + "\nTotal Rent Cost:" + rental1.calculateTotalCost());
		System.out.println("\nCustomer Name: "+rental2.getCustomerName() + "\nTotal Rent Cost:" + rental2.calculateTotalCost());
	}
}
