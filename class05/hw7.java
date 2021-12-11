package com.syntax.class05;

import java.util.Scanner;

public class hw7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        
     String answer= input.next();
     
     if (answer.equals("yes") || answer.equals("yeap") || answer.equals("yeah")) {
    	 System.out.println("Please tell me the balance");
     }else {
    	 System.out.println("Do you want to get a credit card?");
     }
      System.out.println("end of the code");  
	}
}