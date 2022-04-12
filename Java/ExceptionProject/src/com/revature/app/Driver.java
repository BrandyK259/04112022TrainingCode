package com.revature.app;

public class Driver {
	public static void main(String[] args) {
	
		System.out.println("Whatever you do, DO NOT push the button...");
		try {
		// #4
		bigRedButton();
		}
		catch (InevitableException e) {
			System.out.println(e);
		}
	}
	
	//#3
	public static void bigRedButton() throws InevitableException{
			throw new InevitableException();
	}
}

