package com.syntax.class07;

import java.util.Scanner;

public class Taskho {

	public static void main(String[] args) {
		/*
		 * To calculate sum of all even and all odd numbers from range 1 to 100
		 */
		
		/*ask user to pay for an item	
		 * continue asking to pay until user gets a right amount
		 * 
		 * if user gives extra money --> give change
		 * if user gives less money --> ask how much more you need 
		 */

		 
		 int price=15; 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("What item would you like?");
		 String item=scan.next();
		 int amount;
		 int change;
		 
		 if (item.equals("banana")) {
		 System.out.println("Please pay");
		  amount=scan.nextInt();
		  change=scan.nextInt();
		  
		  do {  
		  System.out.println("Your change is"+ amount);
		  
		  } while (change > amount - price);
		  
	
		  
  
		 
 }
	}
}
