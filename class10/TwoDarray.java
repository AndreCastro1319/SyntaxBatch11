package com.syntax.class10;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][] groceries= {{ "banana","apple","mango"},
								{"potato","tomato" },
								{"milk","cheese","ayran","yogurt"}
	};
				System.out.println(groceries.length); // # arrays
			System.out.println(groceries[2][3]);		//	yogurt
			// how do we get all elements my 1 array has
			System.out.println("#of elements inside 1 array= " +groceries[0].length);
			System.out.println("#of elements inside 2 array= " +groceries[1].length);
			System.out.println("#of elements inside 3 array= " +groceries[2].length);
			
			// how do we get all elements from 2D array?????
			
			int total=0;
				for (int i=0; i<groceries.length; i++ ) { //iterates over arrays 
					for (int j=0; j<groceries[i].length; j++ ) { //itirates over elements of each single array
				
			System.out.print(groceries[i][j]+ " ");
			total++;
			}
			
			System.out.println();
		}
	}

}
