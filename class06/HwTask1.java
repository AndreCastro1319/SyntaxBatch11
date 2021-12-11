package com.syntax.class06;

import java.util.Scanner;

public class HwTask1 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 *  Please complete this assignment in 2 ways: using if statement and switch case.
		 */
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter number");
	    int a=scan.nextInt();
	    System.out.println("Enter number");
	    int b=scan.nextInt();
	    System.out.println("Enter Operator");
	    String Operator=scan.next();
	    
	    switch (Operator) {
	    
	    case "+":
	    	System.out.println(" the result is "+(a+b));
	    	break;
	    case "-":
	    	System.out.println(" the result is "+(a-b));
	    	break;
	    case "*":
	    	System.out.println(" the result is "+(a*b));
	    	break;
	    case "/":
	    	System.out.println(" the result is "+(a/b));
	    	break;
	    default:
	    	System.out.println("Invalid");
	    }
	    
	
	
	
	
	
	} 
	

}
