package com.syntax.class05;

import java.util.Scanner;

public class TaskLogical1 {

	public static void main(String[] args) {
		/*Prompt the user to enter person heights in inches.
         *Person should be classified as one of the following:
         *short (under 60 inch)
         *medium(between 60 -72 inch)
         *tall (over 72 inch)
         */
         
         Scanner scan=new Scanner(System.in);
         System.out.println("Please enter persons height in inches");
         
         int height=scan.nextInt();
         
         if(height>=1 && height<=60) {
        	 System.out.println("short");
         }else if(height>=61 && height <=72) {
        	 System.out.println("medium");
         }else if(height>=73 && height <=100) {
        	 System.out.println("tall");
         }else {
        	 System.out.println("wrong input");
        	 
        	 
         }
         
         

	}

}
