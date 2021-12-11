package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter an item you want to buy");
		
		String name=scan.next();
		
		System.out.println("Please enter the price of the "+name);
	double price=scan.nextDouble();
	
	System.out.println("You selected "+ name +" with price = "+ price);
	
	
	
	}
	
	

}
