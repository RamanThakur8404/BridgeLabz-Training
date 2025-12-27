package com.constructor.level1;

public class HotelBooking {
	//Attribute
	private String guestName;
	private String roomType;
	private int nights;
	
	// default constructor
	public HotelBooking() {
		guestName = "Rohan Mishra";
		roomType = "AC";
		nights = 1;
	}
	
	// parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights){
			this.guestName = guestName;
			this.roomType = roomType;
			this.nights = nights;
	}
	
	// copy constructor
	public HotelBooking(HotelBooking guest) {
		this.guestName = guest.guestName;
		this.roomType = guest.roomType;
		this.nights = guest.nights;
	}
	
	// display guest Details
	void displayGuestDetials() {
		System.out.println("Guest Name: " + guestName);
		System.out.println("Guest Room Type: " + roomType);
		System.out.println("Nights stay (in days): "+ nights);
		System.out.println();
	}
}
