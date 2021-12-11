package com.syntax.class11;

public class ObjectsClassDogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectsClassDog jimmysDog= new ObjectsClassDog();
		jimmysDog.name="Teddy";
		jimmysDog.breed="Labrador Retriever";
		jimmysDog.color="Gold";
		jimmysDog.height=5.5;
		jimmysDog.age=5;
		jimmysDog.gender='M';
		
		System.out.println("My Dog Name is "+jimmysDog.name);
		System.out.println("His breed is "+jimmysDog.breed);
		System.out.println("His color is "+jimmysDog.color);
		System.out.println("His height is "+jimmysDog.height);
		
		ObjectsClassDog arwasDog= new ObjectsClassDog();
		arwasDog.name="Manroe";
		arwasDog.breed="Labrador Retriever";
		arwasDog.color="Gold";
		arwasDog.height=5.5;
		arwasDog.age=5;
		arwasDog.gender='M';
		
		
	}

}
