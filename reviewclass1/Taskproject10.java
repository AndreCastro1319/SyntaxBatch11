package com.syntax.reviewclass1;

public class Taskproject10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		
		int[] numbers = { 40,30,20,10,5};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
	
		for(int number:numbers) {
			
			if(number>largest) {
				secondLargest=largest;
				largest=number;
			
			}else if (number>secondLargest && largest!=number) {
				secondLargest=number;
			}
		}
	
		System.out.println(" Second Largest "+secondLargest);
	
	}

}
