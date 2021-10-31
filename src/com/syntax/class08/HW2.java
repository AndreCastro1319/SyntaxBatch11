package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		//Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.
		
		Scanner scan=new Scanner(System.in);
		
		Object apply;
		do {
			System.out.println("Would you like to apply for a credit card?");
		     apply=scan.next();
		}while (apply.equals("no"));
		System.out.println("Thank you!");
		
		
		
	
		
	}

}
