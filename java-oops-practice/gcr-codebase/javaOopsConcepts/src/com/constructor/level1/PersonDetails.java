package com.constructor.level1;

public class PersonDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal object
		Person person = new Person("Yashraj",21,"Male");
		person.displayDetails();
		
		// copied object reference 
		Person person1 = new Person(person); 
		person1.displayDetails();
	}
}
