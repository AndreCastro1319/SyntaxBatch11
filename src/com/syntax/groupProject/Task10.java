package com.syntax.groupProject;

public class Task10 {

	public static void main(String[] args) {
		// TODOprint second largest number
		int arr[]= {7,0,3};
		int max=arr[0];       
		int max2=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}if (arr[i]>max2 && arr[i]<max) {
				max2=arr[i];
			}}
		
			System.out.println("The second largest number is "+max2);
		
	}

}
