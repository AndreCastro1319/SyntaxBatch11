package com.syntax.class16;

public class Dog {

	String name;
	static int noOfLegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	
	void displayName() {
		System.out.println(name);
	//	System.out.println(noOfLegs); you can add static to reg methods
	}
	
	
	static void DisplayLegs() {
	//	System.out.println(name); not allowed, cant because is not static v (name can be a diff var for different objects)
		System.out.println(noOfLegs);
	}
	void printInfo() {
		displayName();
		displayColor();
		DisplayLegs();
	}
	public static void main(String[]args) {
		
		
		Dog dog1=new Dog();
		dog1.name="Casper";
		dog1.displayName();
		
		Dog dog2=new Dog();
		dog2.name="Teddy";
		dog2.displayName();
		
		Dog dog3=new Dog();
		dog3.name="Chapin";
		dog3.displayName();
	
		Dog.DisplayLegs();
	
	}
}
