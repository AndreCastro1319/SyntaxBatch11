package com.syntax.class10;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] drinks=new String[3];
		drinks[0]="Water";
		drinks[1]="Tea";
		
		int size=drinks.length;
		System.out.println(size);
		
		for( int i=0; i<size; i++) {
			System.out.println(drinks[i]);
		}
		
		
		
	}

}
