package com.constructor.level1;

public class Person {
	//attribute
	private String name ;
	private int age;
	private String gender;
	
	// parameterized constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// copy constructor
	public Person(Person person) {
		this.name = person.name;
		this.age = person.age;
		this.gender = person.gender;
	}
	
	public void displayDetails() {
		System.out.println("Person Name: " + name);
		System.out.println("Person Age: " + age);
		System.out.println("Person Gender: "+ gender);
		System.out.println();
	}
}
