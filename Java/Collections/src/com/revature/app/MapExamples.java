package com.revature.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	static Map<String, String> favoriteCars;
	
	public static void show() {
		
		
		favoriteCars = new HashMap<String, String>();
		
		favoriteCars.put("Jacob", "Dodge Dart Ltd");
		favoriteCars.put("Brandy", "Punchbug");
		
		// These will have the same hashcode as the key, but it will ultimately look 
		// for the original key string to find the correct value
		favoriteCars.put("Mohammed", "Range Rover");
		favoriteCars.put("oMhammed", "Some Car");
		
		String name = "Jacob";
		String faveCar = favoriteCars.get(name);
		System.out.println(name + "'s favorite car is " + faveCar);
		
		// Maps cannot be iterated though normally as it is not technically part of collections, 
		// and therefore doesn't have the iterator, however...
		
		// We can get a set of all keys in the Map
		Set<String>keys = favoriteCars.keySet();
		
		//Which allows us to iterate through all elements in the map
		for (String s : keys) {
			System.out.println(s);
		}
	}
}
