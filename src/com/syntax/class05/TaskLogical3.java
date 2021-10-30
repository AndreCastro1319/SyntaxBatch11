package com.syntax.class05;

import java.util.Scanner;

public class TaskLogical3 {

	public static void main(String[] args) {
		// Ask user to enter 3 numbers and define which is the largest number.
		
	Scanner scan=new Scanner(System.in);
	System.out.println("User define number");
	
	int num=scan.nextInt();
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
	if (num==num1 && num==num2) {
		System.out.println("Numbers are equal");
	}else {
	
		if (num>=num1 && num>num2) {
		System.out.println(num+"is the largest number");
		
		if (num%2==0) {
		System.out.println(num+"is the even number");
		}else {
			System.out.println(num+"is the odd number");
		}
		
	} else if (num1>=num && num1>num2) {
	System.out.println(num1+"is the largest number");
	    
	
	}else if (num2>num && num2>=num1) {
		System.out.println(num2+"is the largest number");
	
	
	}
	}
		
	}
}
