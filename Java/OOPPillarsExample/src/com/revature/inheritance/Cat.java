package com.revature.inheritance;

public class Cat extends Pet{

	// Attributes
	String color;
	String favoriteFood;
	
	// This method overrides the sleep method in the parent pet class
	public void sleep() {
		System.out.println("The cat sleeps all day.");
	}
}
