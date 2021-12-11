package com.syntax.class17;

public class Car {

private	String name;
private	String make;
private	String model;
private	String color;
private	int year;
private	int engineCC;
private	String VIN;
private	int mileage;
private	int maxSpeed;
private	boolean sunroof;
	
public Car() {// CONSTRUCTOR!!!
	
}
public Car(String carName, String carMake, String carModel,String carColor) {//CONSTRUCTOR!!!
	
	name=carName;
	make=carMake;
	model=carModel;
	color=carColor;
}

public Car(String carName, String carMake, String carModel, String carColor,
		int carYear, int carEngineCC, String carVIN,
			int carMileage, int carMaxSpeed, boolean carSunroof) {
			
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		engineCC=carEngineCC;
		VIN=carVIN;
		mileage=carMileage;
		maxSpeed=carMaxSpeed;
		sunroof=carSunroof;
		
		System.out.println(name);
	System.out.println(make);
		System.out.println(model);
	System.out.println(color);
		System.out.println(year);
		System.out.println();

			}

//	public void printName() {
	//	System.out.println(name);
//	}
	
//	public void sayHello() {
	//	System.out.println("Hello");
	}

