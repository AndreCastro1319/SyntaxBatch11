package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space
           Print numbers from 100 to 1
           Print even numbers from 20 to 1 (2 ways)
           Print odd numbers between 20 and 50 (2 ways
		 */
		    for(int a=1; a<=100; a++) {
			System.out.print(a+ " ");
		    }
	         System.out.println();
		     for (int b=100; b>=1; b--) {
	         System.out.print(b+ " " );
	         }
	    
		     System.out.println();
	         for (int c=20; c>=1; c--) {
	    	 if (c % 2==0) {
	    	 System.out.print(c+" ");
	    	 }
	    	 }
       	     System.out.println();
	    	 for (int d=20; d>=1; d-=2) {
	         System.out.print(d+" ");
	         }
	         System.out.println();
	         for (int e=20; e<=50; e++) {
	         if (e%2!=0) {
	        	 System.out.print(e+" ");
	         }
	         }
	         System.out.println();
	         for (int f=21; f<=50; f+=2){
	        	 System.out.print(f+" ");
	         }
	         
	         
	    }

	
	}

