package com.syntax.class07;

import java.util.Scanner;

public class DoLoopDemo2 {

	public static void main(String[] args) {
		/*
		 * lets create a secret number ( 1-100)
		 * lets ask user to guess my secret number 
		 *  keep asking for a number till user guess the secret number
		 */

		 int secretNumber=78;
		  Scanner scan=new Scanner(System.in);
		  int userNumber;
		  
		  System.out.println("Please guess my secret number from 1 - 100");
		userNumber=scan.nextInt();
		
		while (userNumber != secretNumber) {
			
		System.out.println("Please guess my secret number from 1 - 100");
		userNumber=scan.nextInt();
		
		}
		System.out.println("You got it!");
	}

}
