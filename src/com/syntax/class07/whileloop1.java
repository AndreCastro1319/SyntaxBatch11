package com.syntax.class07;

import java.util.Scanner;

public class whileloop1 {

	public static void main(String[] args) {
		// I want to ask a user their name and age 5 times
	
		Scanner scan = new Scanner(System.in);
		
		int a=5;
		while (a >= 1) {
		
		System.out.println("Please enter your name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		
		System.out.println("Your name is "+ name + " and your "+ age + " years old " );
		
		a--;
		}
		
		
		
		
		
		
		
		
		
		int day=1;
	 			
		while (day<=10) {
			
			System.out.print(" Good morning");
			
			day++;
		
		}
		day++;
	}

	
}