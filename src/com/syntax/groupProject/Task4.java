package com.syntax.groupProject;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		 // Create an array on double values using scanner and calculate the sum of all stored elements in that array.

		
		
		
		
		System.out.println("Please enter the number of elements you want to store");
		Scanner input=new Scanner(System.in);
		double[] number=null;
		double sum=0.0;
		int size =input.nextInt();
		number=new double[size];
		
		System.out.println("Please enter the numbers");
		 
		for(int i=0;i<number.length;i++) {
			 number[i]=input.nextDouble();
			
			sum+=number[i];}
				System.out.println(sum);
			}
		}

		
	


