package com.syntax.class16;

import java.util.Arrays;

public class task1 {
 //Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class. 
	

	 int sumArray( int[] sum) {
	    int add=0;
	    for(int i=0; i< sum.length; i++) { 
	     add+= sum[i];
	    }

	    return add;
	}
   
	
	 public static void main(String[]args) {
		 
		task1 ok=new task1();
		int [] arr= {10,10,10};
		System.out.println(ok.sumArray(arr));
	 }


	
}
