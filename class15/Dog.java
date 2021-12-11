package com.syntax.class15;

public class Dog {

	String name; // Instance variable
	String color;// Instance variable
	static int noOfLegs=4;
	void sleep() {
		int time=3;
		System.out.println(time);
		System.out.println(name+" is sleeping");
	}
	
	void eat() {
		//System.out.println(time); as time is local variable we can not access it outside of sleep method.
		System.out.println(name+" can eat");
		
	}
		public static void main(String[]args) {
			
		Dog dog=new Dog();
		
		dog.name="Casper";
		dog.color="Black";
		dog.sleep();
		dog.noOfLegs=4;
		
		
		Dog dog1=new Dog();
		
		dog.name="Casperki";
		dog.color="White";
		dog.sleep();	
		System.out.println(dog1.noOfLegs);
		
		
		
		}	


}
