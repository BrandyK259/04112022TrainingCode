package com.revature.ex;

import java.util.Scanner;

public class driver {
	
	public static void main (String[] args) {
		
		// The try statement lets you execute a block of code for the sake of testing 
		// for errors
		try {
			// block of code we want to try
			int [] partyPokemon = {1, 2, 3, 4, 5, 6};
			System.out.println(partyPokemon[4]);
		}
		catch(Exception e) {
			// The exception we want to catch, in this case we catch an exception 
			// and assign it to variable e
			System.out.println("A party can only have 6 pokemon.");
			
			// -My Note- this system can be used for debugging like so:
			//System.out.println("Exception '" + e + "' thrown.");
		}
		finally {
			//The finally statement executes a line of code after the try/catch blocks
			// no matter what the result of the try/ catch was
			System.out.println("The finally statement has run successfully.");
		}
		
		// This is our new scanner called userObj for getting user input
		Scanner userObj = new Scanner(System.in);
		
		/*System.out.println("How many pokemon are in your party");
		int party = userObj.nextInt();
		myException.checkPartySize(party);
		System.out.println("Who is your favorite Pokemon?");
		String myInput = userObj.nextLine();
		System.out.println("My favorite pokemon is " + myInput);*/
		
		int myInput;
		try {
			System.out.println("Who is your favorite number?");
			myInput = userObj.nextInt();
			System.out.println("My favorite number is "+ myInput);
		}
		catch(Exception e) {
			System.out.println("The data entered is invalid, please input a number.");
		}
		
	}
}
