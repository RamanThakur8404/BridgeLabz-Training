package vehiclerentalsystem;

public class Car extends Vehicle implements Rentable{
	private int perDayRate;
	final int surcharges = 500;
	
	public Car(String name, String model, String color,int perDayRate) {
		super(name,model,color);
		this.perDayRate = perDayRate;
	}
	
	@Override
	public double calculateRent(int days) {
		 return (days * perDayRate) + surcharges;
	}
}
