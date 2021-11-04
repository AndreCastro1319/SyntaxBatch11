package com.syntax.groupProject;

public class Task9 {

	public static void main(String[] args) {
		// Maximum and Minimum number of array
		
		int arr[]= {7,0,3};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}else if(arr[i]<min) {
				
			min=arr[i];}}
		
			System.out.println("Minimum number in array is "+min);
			System.out.println("Maximum number in array is "+max);
		}
	

	}

