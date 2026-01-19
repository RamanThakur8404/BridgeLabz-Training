package com.sorting.fleetmanager;
public class Vehicle {
    private String vehicleID;
    private int mileage;

    public Vehicle(String vehicleID, int mileage) {
        this.vehicleID = vehicleID;
        this.mileage = mileage;
    }

    public String getVehicleID() {
        return "Vehicle ID: " + vehicleID;
    }

    public int getMileage() {
        System.out.print("Vehicle Mileage: ");
    	return mileage;
    }
}
