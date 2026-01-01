package com.inheritance.singleinheritance.problem2;

public class SmartHomeDevice {
	public static void main(String []args) {
		
		Thermostat thermostat = new Thermostat(101, "ON", 22.5);
		thermostat.displayStatus();
	}
}
