package com.syntax.class14;

import java.util.Scanner;

public class HomeworkReviewT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter fathers name ");
		String fathersName=scan.nextLine();
		System.out.println("Enter mothers name");
		String mothersName=scan.nextLine();
		System.out.println("Enter gender");
		String isBoyGirl=scan.nextLine();
		
		if(isBoyGirl.equalsIgnoreCase("boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
		
		 System.out.println( firstPart+secondPart);
		}
	}

}
