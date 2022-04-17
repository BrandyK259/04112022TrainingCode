package com.revature.inheritance;

public class Driver {

	public static void main(String[] args) {
		
		
		Dog beagle = new Dog();
		beagle.color = "brown";
		//beagle.size = "small";
		beagle.hairLength = "short";
		beagle.sound = "bark bark";
		
		System.out.println("The beagle is " + beagle.color + " and " + beagle.size);
		
		Cat tabby = new Cat();
		tabby.color = "brown";
		tabby.favoriteFood = "tuna";
		tabby.size = "small";
		tabby.sound = "meow meow";
		
		System.out.println("The tabby says " + tabby.sound + " and is " + tabby.size);
		
		beagle.sleep();
		tabby.sleep();
		
		String dogFood = beagle.treats("beggin strips", "kibble");
		System.out.println(dogFood);
		beagle.treats("bacon");
		
		
	}

}
