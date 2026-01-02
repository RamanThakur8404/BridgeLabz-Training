package com.polymorphismandencapsulation.ridehailing;

public class Car extends Vehicle {

    public Car(int vehicleId, String driverName) {
        super(vehicleId, driverName, 15); // Car rate
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
