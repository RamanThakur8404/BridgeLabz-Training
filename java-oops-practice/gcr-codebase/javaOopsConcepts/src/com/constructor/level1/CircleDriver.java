package com.constructor.level1;

public class CircleDriver {
	public static void main(String []args) {
		
		// default value
		Circle circle1 = new Circle();
		System.out.println("The default radius value :"+ circle1.getRadius());
		
		// user-provided value
		Circle circle2 = new Circle(4.5);
		System.out.println("The user-provided value :"+circle2.getRadius());
	}
}
