package com.syntax.groupProject;

public class Task5 {

	public static void main(String[] args) {
		
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
	
	
		String [][]CapitalsC= {
	    		
				{"Ecuador","Bolivia","United States"},
					{"Quito","La Paz","Washington DC"},	
		   
		                   };
		    
			 for(int i=0; i<CapitalsC.length/2;i++) {
				 for(int j=0; j<CapitalsC[i].length; j++) {

				 System.out.println(CapitalsC[i][j]+" - "+CapitalsC[i+1][j]);
			 }
				 }
			 System.out.println();
			 int i=0;
			 int j=0;
			 while(i<CapitalsC[i].length/2) {
				 while(j<CapitalsC[i].length) {
				 System.out.println(CapitalsC[i][j]+" - "+CapitalsC[i+1][j]);
				 j++;
			 }
			i++;
			}}
			
		}