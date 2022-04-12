package com.revature.ex;

public class myException {

	static void checkPartySize(int partySize) {
		if (partySize > 6) {
			
			// This uses the throw keyword
			throw new ArithmeticException("No more than 6 pokemon can be in your party at one time.");
		}
		else {
			System.out.println("Party size accepted");
		}
	}
}
