package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 *  Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *   A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *    At the end your program should print which grade was entered by a user with explanation.
		 */
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a grade");
	char grade;
	grade=scan.next().charAt(0);
	
    String Explanation=null;
    
    switch (grade) {
    case'A':
    	Explanation="Excellent";
    	break;
    case'B':
    	Explanation="Good";
    	break;
    case'C':
    	Explanation="Average";
    	break;
    case'D':
    	Explanation="Bad";
    	break;
    	
    	default:
        Explanation=("Not Acceptable");
    }
	if (!Explanation.equals("Not Acceptable")) {
		System.out.println(grade+" is "+Explanation);
	}else {
		System.out.println("Try another grade");
	}
	

	
	}

	
	
	
	

}
