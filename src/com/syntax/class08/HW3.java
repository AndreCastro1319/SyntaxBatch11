package com.syntax.class08;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 *  Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please provide an start integer");
		int a=scan.nextInt();
		System.out.println("Please provide an end integer");
		int b=scan.nextInt();
		int sumofeven=0;
		int sumofodd=0;
		
		for (int i=a; i<=b; i++) {
			if(i%2==0) {
				sumofeven += i;
			}else {
				sumofodd += i;
			}
		}
			System.out.println("The sum of even integers is "+sumofeven);
			System.out.println("The sum of even integers is "+sumofodd);
	    	    	 
			     }
					
				}
			
		
		
		
		
		
		
		
   

