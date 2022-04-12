package com.revature.app;

//#1
public class InevitableException extends Exception{

	//#2
	public InevitableException() {
		super("Why did you press the button?!");

	}
}
