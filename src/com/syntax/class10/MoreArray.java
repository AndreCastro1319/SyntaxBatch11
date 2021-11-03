package com.syntax.class10;

public class MoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] grades= {'A','D','A','B','C'};
		
			for(char grade:grades) {
				
				System.out.println(grade);
				
			}
		System.out.println("- - - - - - - - -  -- ");
			for(int i=grades.length-1; i>=0; i--) {
				
				System.out.println(grades[i]);
			}
	}

}
