package com.constructor.level1;
public class Circle {
	// attribute
	private double radius;
	
	// default constructor
	public Circle(){
		this(3.5);
	}
	
	// parameterized constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
}
