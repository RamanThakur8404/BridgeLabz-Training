package com.inheritance.assistedprobems.animalHierarchy;

public class Animal {
	//instance variable
	protected String name;
	protected int age;
	
	//constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//make sound
	void makeSound() {
		System.out.println("Animal makes sound");
	}
	
	// method to view details
	void details() {
		System.out.println("The name of Animal "+this.name);
		System.out.println("Age of "+this.name+" is "+ this.age);
	}
}
