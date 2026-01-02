package vehiclerentalsystem;

public class Vehicle {
	private String name;
	private String model;
	private String color;
	
	
	public Vehicle(String name, String model, String color){
		this.name =name;
		this.model = model;
		this.color = color;
	}
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle Name: "+ name);
		System.out.println("Vehicle model: "+ model);
		System.out.println("Vehicle color: "+ color);
	}
}
