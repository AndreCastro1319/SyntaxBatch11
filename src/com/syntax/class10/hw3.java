package com.syntax.class10;

public class hw3 {

	public static void main(String[] args) {
		// Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops

			String [][] cars = {{ "American","German","Korean","Italian"},
								{ "Ford","Bmw","Honda","Ferrari"},
			};
			
			   for(String [] car:cars) {
				
				for(String c:car) {
					
					System.out.print(c+" ");
			
	
				}
				
				System.out.println();
				
			   	}		
			   
			   System.out.println(" - - - - - - - - - - - - - - - - - - - - -- - - -");
			   
			   for(int i=0; i<cars.length; i++) {
					
					for(int j=0; j<cars[i].length; j++) {
						
					String	value=cars[i][j];
						System.out.print(value+" ");
					}
					
						System.out.println();
				}
			   
			   
			   
			   
		
			}

}
