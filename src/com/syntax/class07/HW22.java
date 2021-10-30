package com.syntax.class07;

import java.util.Scanner;

public class HW22 {

	public static void main(String[] args) {
		/*
		 * ASK user to pay for an item	
		 * continue asking to pay until user gets a right amount
		 * if user gives extra money --> give change
		 * if user gives less money --> ask how much more you need 
		 * 
		 */

		
		Scanner scan=new Scanner(System.in);

		String item;
		int price=100;
		int usersamount=0;
		int totalusers=0;
		
		System.out.println("What item would you like to buy");
		item=scan.next();
        System.out.println( item + " is $ " + price );
		
       
        while ( usersamount != price) {
	        System.out.println( " Please enter amount you're going to pay?" );
	        usersamount +=  scan.nextInt();
	        
	        if  (usersamount < price) {
	        	System.out.println("Not enough, You still need to pay "+ (price - usersamount));
	        }else if (usersamount > price) {
	        	System.out.println("Your change is "+ (usersamount - price));
	       break;
	        }
            	System.out.println(usersamount);
        }
	    System.out.println("Thank you for shopping");    
	
	}
	}
    
    
