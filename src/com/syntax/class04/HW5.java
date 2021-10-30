package com.syntax.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
		
		boolean creditcard=true;
		int balance=2000;  // YOU DONT NEED TO ASSIGN A VALUE.. VALUE IS ALREADY ON VARIABLE
		
		creditcard=scan.nextBoolean();
		balance=scan.nextInt();
		
		if (creditcard== true) {
			System.out.println("Whats the balance of the card");
			
		if (balance>1000) {
			System.out.println("Pay immediately");
		} else if (balance<1000) {
			System.out.println(" Can spend more");
		
		} else { 
			System.out.println("Get a New Card");
		}
		
		
		
		
		
		
		
		
		}	
		
	}

}
