package com.syntax.class13;

import java.util.Arrays;

public class MethodsArray {

	
	int [] doubleArray (int [] arr) {
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=arr[i]*2;
			
		}
			return arr;
	}

	public static void main(String[]args) {
	
		MethodsArray obj= new MethodsArray();
		
		int [] array = {10,10,10};
		
		array= obj.doubleArray(array);
		
		System.out.println(Arrays.toString(array));
	}
	
	
	
	
}
