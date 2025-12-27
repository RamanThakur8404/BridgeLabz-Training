package com.constructor.level1;

public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// default constructor
		HotelBooking guest1 = new HotelBooking();
		guest1.displayGuestDetials();
		
		//parameterized constructor
		HotelBooking guest2 = new HotelBooking("Vinod Khanna", "AC", 3);
		guest2.displayGuestDetials();
		
		//copy constructor
		HotelBooking guest3 = new HotelBooking(guest2);
		guest3.displayGuestDetials();
	}

}
