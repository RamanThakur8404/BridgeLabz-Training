package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void drive() {
    	super.displayDetails();
        System.out.println("Electric vehicle is driving silently.");
    }

    public void charge() {
        System.out.println("Charging electric vehicle.");
    }
}

