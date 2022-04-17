package com.revature.app;

import com.revature.generic.MyGenericClass;
import com.revature.generic.MyObjectBasedClass;
import com.revature.generic.Vehicle;
import com.revature.iterator.IteratorExamples;

public class Driver {

	public static void main(String[] args) {
		//ListExamples.show();
		
		//QueueExamples.show();
		
		//SetExamples.show();
		
		//MapExamples.show();
		
		//IteratorExamples.show();
		
		MyGenericClass<Object> objectGeneric = new MyGenericClass<Object>(new Object());
		
		//default object toString method is ...
		objectGeneric.showPayload();
		
		
		MyGenericClass<String> stringGeneric = new MyGenericClass<String>("Hello!");
		stringGeneric.showPayload();
		
		// int is a primitive type and will not work unless you use the wrapper class
		//MyGenericClass<int> intGeneric = new MyGenericClass<int>(77);
		MyGenericClass<Integer> intGeneric = new MyGenericClass<Integer>(77);
	    intGeneric.showPayload();
		
		Vehicle v = new Vehicle("Ford", "Ranger", "1997");
		MyGenericClass<Vehicle> vehicleGeneric = new MyGenericClass<Vehicle>(v);
		vehicleGeneric.showPayload();
		
		// Don't do this as generic classes are easier and more versatile
		// also this kind of thing allows for human error
		//MyObjectBasedClass mobc = new MyObjectBasedClass(v);
		//mobc.showPayload();
		//Vehicle w = (Vehicle)mobc.myPayload;
	}

}
