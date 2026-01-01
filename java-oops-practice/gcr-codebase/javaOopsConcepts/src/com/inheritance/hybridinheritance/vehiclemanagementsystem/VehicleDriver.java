package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        Vehicle pv = new PetrolVehicle("Honda City", 180);

        ((ElectricVehicle) ev).drive();
        ((ElectricVehicle) ev).charge();
        System.out.println();
        
        ((PetrolVehicle) pv).drive();
        ((Refuelable) pv).refuel();
    }
}
