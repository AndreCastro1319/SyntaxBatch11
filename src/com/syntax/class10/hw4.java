package com.syntax.class10;

public class hw4 {

	public static void main(String[] args) {
		// Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. 
		//Retrieve all values from that array using 2 different loops

		String [][]food= { {"Tomato","Potato","Carrot"},
						   {"Banana","Apple","Pear"},
						   {"Milk","Cheese","Yogurt"},
						   {"Chocolate","Candy","Bubblegum"}
		};
		
		for(String[] groceries:food)  {
			
			for ( String g:groceries) {
				
				System.out.print(g+" ");
			}
				System.out.println();
		}
		
		System.out.println(" - - - - - - - - - - - - - - - - - - ");
		
		for(int i=0; i<food.length; i++) {
			
			for(int j=0; j<food[i].length; j++) {
				
				String	values=food[i][j];
				System.out.print(values+" ");
			}
			
				System.out.println();
		
		
		}	
		
	}

}
