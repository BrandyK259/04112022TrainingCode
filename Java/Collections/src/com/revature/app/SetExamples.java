package com.revature.app;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	static Set<String> stringSet;
	
	public static void show() {
		
		stringSet = new HashSet<String>();
		
		stringSet.add("Hello!");
		stringSet.add("Goodbye!");
		
		// If the if statement only has one line of body, you can forego the curly braces
		if	(stringSet.contains("Hello!"))
			System.out.println("String Set contains Hello!");
		
		// The main functionality of a set is discarding repeat elements
		stringSet.add("Hello!");
		
		// Same as the if loop earlier
		for(String s : stringSet) 
			System.out.println(s);
		
		
	}
}
