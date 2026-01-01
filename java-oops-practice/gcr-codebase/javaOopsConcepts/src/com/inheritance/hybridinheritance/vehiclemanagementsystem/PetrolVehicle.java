package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String name, int maxSpeed) {
        super(name,maxSpeed);
    }

    public void drive() {
        super.displayDetails();
        System.out.println("Petrol vehicle is driving.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle.");
    }
}
