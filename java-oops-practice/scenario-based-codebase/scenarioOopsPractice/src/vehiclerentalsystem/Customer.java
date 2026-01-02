package vehiclerentalsystem;

public class Customer {
	private String name;
	private String addharNumber;
	private int age;
	
	public Customer(String name, String addharNumber, int age) {
		this.addharNumber = addharNumber;
		this.name = name;
		this.age = age;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + age);
		System.out.println("Customer AddharNumber: " + addharNumber);
	}
	
}
