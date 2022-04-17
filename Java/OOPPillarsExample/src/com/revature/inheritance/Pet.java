package com.revature.inheritance;

// I am the parent class
public class Pet {

	//Attributes
	String size = "large";
	String sound;
	
	
	//Methods
	public void sleep() {
		System.out.println("zzz");
	}
	
	// This method will be overloaded
	public void treats(String treats) {
		System.out.println("My pet likes " + treats);
	}
}
