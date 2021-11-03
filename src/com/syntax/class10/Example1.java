package com.syntax.class10;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// I want to create an array and store elements using Scanner
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter how many elements you want to store inside array of cars");
		
		int size=scan.nextInt();
		
		String[] cars=new String[size];
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Please enter your cars");
			
			cars[i]=scan.next();
			
		 	
		}
		
		for(String car:cars) {
			System.out.println(car+ " ");
		}

		
		
		
		
	}
}
