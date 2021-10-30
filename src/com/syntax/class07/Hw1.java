package com.syntax.class07;

public class Hw1 {

	public static void main(String[] args) {
		// To calculate sum of all even and all odd numbers from range 1 to 100
		  int sum=0;
		  int total=0;
		//Even numbers
		 
		  for (int a=2; a<=100; a+=2) { 
			  sum+=a;  
		  }
		   System.out.println(sum);
	      
	    //Odd numbers
	    	System.out.println();
	    	
	        for (int a=1; a<=100; a+=2) {
	    	   total+=a;
	        }
	    	   System.out.print(total);
	    	  
	      
	    	  
	      }
	    
	}
	
