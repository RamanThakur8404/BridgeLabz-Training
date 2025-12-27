package com.constructor.level1;

//VehicleDriver.java
public class VehicleDriver {
 public static void main(String[] args) {

     // Creating vehicle objects
     Vehicle vehicle1 = new Vehicle("Robin", "Car");
     Vehicle vehicle2 = new Vehicle("Celvin", "Bike");

     // Display initial vehicle details
     vehicle1.displayVehicleDetails();
     vehicle2.displayVehicleDetails();

     // Update registration fee for all vehicles
     Vehicle.updateRegistrationFee(6000);

     // Display details after updating registration fee
     vehicle1.displayVehicleDetails();
     vehicle2.displayVehicleDetails();
 }
}
