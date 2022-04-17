package com.revature.app;

import com.revature.otherPackage.Parent;

public class ExternalRandomClass {

	public void testVisibility() {
		Parent p = new Parent();
		//p.privateInt = 900; // Never visible
		//p.protectedInt = 600; // Not visible because not a child, nor is it in the same package asParent
		//p.defaultInt = 400; // Not visible because the package is not the same as Parent 
		p.publicInt = 100; // Always visible
	}
}
