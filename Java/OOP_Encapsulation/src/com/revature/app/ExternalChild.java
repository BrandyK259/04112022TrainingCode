package com.revature.app;

import com.revature.otherPackage.Parent;

public class ExternalChild extends Parent{

	public void testVisibility() {
		//privateInt = 1; // Never visible
		protectedInt = 16; // Visible due to be a child class of Parent
		//defaultInt = 8; // Not visible because packages are different
		publicInt = 9; // Always visible
	}
}
