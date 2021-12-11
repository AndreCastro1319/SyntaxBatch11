package com.syntax.class13;

public class Methods2Demo {

	void printArray(int [] array) {
		
		for( int number:array) {
			
			System.out.print(number+ " ");
		}
	}
	public static void main(String[]args) {
		
		Methods2Demo obj=new Methods2Demo();
		
		int [] arr= {10,20,30};
		obj.printArray(arr);
	}
	
}
