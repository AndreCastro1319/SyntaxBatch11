package com.syntax.class11;

public class Car {

	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() {
		System.out.println("Moving forward");
	}
	void applybreaks() {
		System.out.println("Applying breaks"); 
	}
	public static void main(String[]args) {
		Car carrito= new Car();
		
		carrito.make="Tesla";
		carrito.model="S";
		carrito.color="Black";
		System.out.println("Ayshas Car is "+carrito.make);
		System.out.println("Ayshas Car is "+carrito.model);
		System.out.println("Ayshas Car is "+carrito.color);
		carrito.moveForward();
		carrito.applybreaks();
	}
	}


