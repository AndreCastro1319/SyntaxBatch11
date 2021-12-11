package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog=new Dog("Boby","Black","Labrador",14,10.7); //creating an object
		//dog.name="boby" not allowed as its private
		dog.printName();
		dog.printAge();
		dog.printBreed();
	}

}
