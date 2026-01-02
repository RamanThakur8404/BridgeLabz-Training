package vehiclerentalsystem;

public class Truck extends Vehicle implements Rentable {
	private int perDayRate;
	private int surcharges = 750;
	
	public Truck(String name , String model, String color, int perDayRate) {
		super(name, model, color);
		this.perDayRate = perDayRate;
	}
	
	@Override
	public double calculateRent(int days) {
		return (perDayRate * days) + surcharges;
	}

}
