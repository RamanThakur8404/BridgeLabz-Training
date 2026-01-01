package com.inheritance.singleinheritance.problem2;

public class Thermostat extends Device{
	//attribute
	protected double temperatureSetting;
	
	//constructor
	public Thermostat(int deviceId, String status, double temperatureSetting) {
		super(deviceId,status);
		this.temperatureSetting = temperatureSetting;
	}
	
	//method to display Status
	public void displayStatus() {
		 System.out.println("Device ID          : " + deviceId);
	        System.out.println("Device Status(ON/OFF)   : " + status);
	        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	}

}
