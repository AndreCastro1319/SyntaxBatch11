package com.syntax.class11;

public class ObjectDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectsClassDog Labrador= new ObjectsClassDog();
		Labrador.name="Teddy";
		Labrador.breed="Labrador Retriever";
		Labrador.color="Gold";
		Labrador.height=5.5;
		Labrador.age=5;
		Labrador.gender='M';
		
		System.out.println("Dog Name is "+Labrador.name);
		System.out.println("His breed is "+Labrador.breed);
		System.out.println("His color is "+Labrador.color);
		System.out.println("His height is "+Labrador.height);
		System.out.println("His color is "+Labrador.age);
		System.out.println("His height is "+Labrador.gender);
		Labrador.run();
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		
		ObjectsClassDog Husky= new ObjectsClassDog();
		Husky.name="Lobo";
		Husky.breed="Husky";
		Husky.color="Black";
		Husky.height=4;
		Husky.age=10;
		Husky.gender='M';
		
		System.out.println("Dog Name is "+Husky.name);
		System.out.println("His breed is "+Husky.breed);
		System.out.println("His color is "+Husky.color);
		System.out.println("His height is "+Husky.height);
		System.out.println("His age is "+Husky.age);
		System.out.println("His gender is "+Husky.gender);
		Husky.howls();
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		
		ObjectsClassDog Bulldog= new ObjectsClassDog();
		Bulldog.name="Gordita";
		Bulldog.breed="Bulldog";
		Bulldog.color="White";
		Bulldog.height=3;
		Bulldog.age=8;
		Bulldog.gender='F';
		
		System.out.println("Dog Name is "+Bulldog.name);
		System.out.println("Her breed is "+Bulldog.breed);
		System.out.println("Her color is "+Bulldog.color);
		System.out.println("Her height is "+Bulldog.height);
		System.out.println("Her age is "+Husky.age);
		System.out.println("Her gender is "+Husky.gender);
		Bulldog.eats();
		
	}
	}	


