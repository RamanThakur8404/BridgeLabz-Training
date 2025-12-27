package com.constructor.level1;

public class Vehicle {
 // Instance variables
 private String ownerName;
 private String vehicleType;
 public static double registrationFee = 5000;

 // Constructor
 	public Vehicle(String ownerName, String vehicleType) {
 		this.ownerName = ownerName;
 		this.vehicleType = vehicleType;
 	}

 // Instance method
 	public void displayVehicleDetails() {
     	System.out.println("Owner Name       : " + ownerName);
     	System.out.println("Vehicle Type     : " + vehicleType);
     	System.out.println("Registration Fee : " + registrationFee);
     	System.out.println();
 	}

 	// Class method
 	public static void updateRegistrationFee(double newFee) {
 		registrationFee = newFee;
 	}
}
