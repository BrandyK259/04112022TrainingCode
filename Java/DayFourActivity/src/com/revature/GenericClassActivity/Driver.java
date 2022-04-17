package com.revature.GenericClassActivity;

public class Driver {

	public static void main(String[] args) {
		
		
		MyArrayList<String> li = new MyArrayList<String>();
		for	(int i = 0; i < 15; i++) {
			li.add("Test number: ");
			System.out.println(li.get(i) + (i+1));
		}
	}

}
