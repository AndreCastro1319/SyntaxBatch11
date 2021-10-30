package com.syntax.class05;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		/* ask user to enter todays date
		 * if monday or friday -->no clas
		 * if tuesday or wednesday--> manual class
		 * if saturday or sunday--> java class
		 *
		 */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays day");
		
		String day=scan.next();
		if (day.equals("Monday") ||  day.equals("Friday")){
			System.out.println("You dont have school");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Have Manual Class");
		}else if (day.equals("Thursday")){
			System.out.println("Review Class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
	    	System.out.println("Java Class");
	    }else {
	    	System.out.println("Wrong input");
	    }
		
		
	   
		
		
	}

}
