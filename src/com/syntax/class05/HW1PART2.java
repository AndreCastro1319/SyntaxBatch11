package com.syntax.class05;

import java.util.Scanner;

public class HW1PART2 {

	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month. Based on the month define the season.
          Example: if user is born in June, July or August → season =“Summer”.
          At the end of the program we should see output as “You were born is season ______“.
		 * 
		 */
	
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter birth month");
		  
		  String month=scan.next();
		  
		  if(month.equals("December") ||  month.equals("January") || month.equals("February")) {
			      month="Winter";
			      System.out.println(" You were born in Winter");
		  }else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			      month="Spring";
			      System.out.println(" You were born in Spring");
		  }else if (month.equals("June") || month.equals("July")  || month.equals("August")) {
			      month="Summer";
			      System.out.println(" You were born in Summer");
		  }else if (month.equals("September") || month.equals("October")  || month.equals("November")){
			      month="Fall";
			      System.out.println(" You were born in Fall");
		  }else {
			  System.out.println("Invalid");
		  }
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
