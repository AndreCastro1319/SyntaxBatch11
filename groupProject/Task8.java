package com.syntax.groupProject;

public class Task8 {

	public static void main(String[] args) {
		// Write a Java Program to print 
		   //the first 10 numbers of Fibonacci series.
		
			int n = 10;
			int firstTerm = 0;
			int secondTerm = 1;
			
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		
			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			      
		      System.out.print(firstTerm + ", ");

		      
		    }
		}

	
	}


