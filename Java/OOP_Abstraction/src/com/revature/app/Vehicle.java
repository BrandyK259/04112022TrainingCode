package com.revature.app;

public class Vehicle implements Comparable<Vehicle>{

	public String make;
	public String model;
	public String year;
	
	public String toString() {
		return year + " " + make + " " + model;
	}

	@Override
	public int compareTo(Vehicle other) {
		// Ascending order (current item vs next item)
		return year.compareTo(other.year);
		
		//Descending order (next item vs current item)
		//return other.year.compareTo(year);
	}
}
