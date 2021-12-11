package com.syntax.class11;

public class Human {

	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodtype;
	
	void eat() {
		System.out.println(name+" eats alot" );
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	void walk() {
			System.out.println(name +" with bloodtype "+ bloodtype+ " is walking");
	}
	void sendmemes() {
		if (name.equals("Sebastian")) {
			System.out.println("sending memes");
		}
	}
}
