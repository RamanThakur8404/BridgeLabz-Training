package vehiclerentalsystem;

public class VehicleRentalSystem {
	public static void main(String []args) {
		
		Customer c1 = new Customer("Rohan","721857191934",34);
		Vehicle bike = new Bike("Royal Enfield","classic-350","blackBlue",2500);
		
		c1.displayCustomerDetails();
		bike.displayVehicleDetails();
		double bikeRent = ((Rentable)bike).calculateRent(5);
		System.out.println("Total Bike rent: "+ bikeRent);
		System.out.println();
		
		Customer c2 = new Customer("Raman","123456789012",22);
		Vehicle car = new Car("BMW","C3","black",5000);
		
		c2.displayCustomerDetails();
		car.displayVehicleDetails();
		double carRent = ((Rentable)car).calculateRent(10);
		System.out.println("Total Car rent: "+ carRent);
		System.out.println("");
		
		Customer c3 = new Customer("Yashu","987654321013",25);
		Vehicle truck = new Truck("Tanker","m2","red",3500);
		c3.displayCustomerDetails();
		truck.displayVehicleDetails();
		double truckRent = ((Rentable)truck).calculateRent(12);
		System.out.println("Total Truck rent: "+ truckRent);
		
	}
}
