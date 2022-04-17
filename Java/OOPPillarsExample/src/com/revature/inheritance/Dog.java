package com.revature.inheritance;

// I am the child class
public class Dog extends Pet{

	// Attributes
	String color;
	

	String hairLength;
	
	
	// This method overrides the sleep method in the parent pet class
	public void sleep() {
		System.out.println("Hey, I am trying to sleep!");
	}
	
	// This method overloads and overrides the treats method in the parent pet class
	public String treats(String treats, String food) {
		System.out.println("My pet likes " + treats + " and " + food);
		
		return food;
	}
	
	
	// This is pulled from the object (god) class by right clicking
	// and selecting the options under "Source"
	@Override
	public String toString() {
		return "Dog [color=" + color + ", hairLength=" + hairLength + "]";
	}
}
