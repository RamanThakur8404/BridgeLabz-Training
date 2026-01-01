package com.inheritance.assistedprobems.animalHierarchy;

public class AnimalHierarchy {
	public static void main(String []args) {
		//create object
		Animal dog = new Dog("Bull Dog",5);
		dog.details();
		dog.makeSound();
		
		Animal cat = new Cat("Bella Cat",2);
		cat.details();
		cat.makeSound();
		
		Animal bird = new Bird("Robin Bird",2);
		bird.details();
		bird.makeSound();
		
	}
}
