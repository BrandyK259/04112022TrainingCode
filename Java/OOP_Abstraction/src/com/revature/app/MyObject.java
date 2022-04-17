package com.revature.app;
/*
 * When a class implements an interface, it promises to implement - that is, write a bay for - 
 * every abstract method in the implemented interface
 * 
 * When a class extends an abstract class, it promises also to implement and abstract methods,
 * and inherits all implemented methods and variables.
 * 
 * While you can only extend one class (including abstract and concrete classes), you can
 * implement unlimited interfaces!
 * 
 *                    v This is creating a parent/child relationship
 */
public class MyObject extends MyAbstractClass implements MyInterface {

	// This method comes from MyInterface
	@Override
	public void doSomething() {
		
	}

	// This method comes from MyAbstractClass
	@Override
	public void implementMe() {
		
	}

}
