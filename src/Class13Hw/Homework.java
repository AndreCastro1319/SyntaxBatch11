package Class13Hw;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// Write a program that reads two people's first
		//	names and if they expecting boy or girl? 
		//	 Based on the input suggests a name for a baby:

		//Example Output:                                      Example Output:
	  //Dad’s first name? Daniel			  						 //Mom’s first name? Mary
	  //Mom's first name ? Mary										 //Dad’s first name? Daniel
	  //Boy or Girl? boy												 //Boy or Girl? girl
	  //Sugguested baby name: DANRY								     //Suggested baby name: MAIEL
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dads name");
		String dad=scan.nextLine();
		System.out.println("Enter moms name");
		String mom=scan.nextLine();
		System.out.println("Enter gender");
		String gender=scan.nextLine();
		
		System.out.println("Baby's name is ");
		
		if (gender.equals("boy")) {
			System.out.println(dad.toUpperCase().substring(0,3)+mom.toUpperCase().substring(2));
		}else {
			gender.equals("girl");
			System.out.println((mom.toUpperCase().substring(0,2)+dad.toUpperCase().substring(3)));
		}	
		
	}
}
