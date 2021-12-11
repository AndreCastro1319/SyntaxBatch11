package com.syntax.class09;

public class TaskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] letters=new char[6];
		letters[0]='A';
	    letters[1]='B';
		letters[2]='C';
		letters[3]='D';
		letters[4]='E';
		letters[5]='F';
	
		System.out.println(letters[1]);
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		
		
		char[] gender; // declare an array
		gender=new char[2];// initialize its size
		
		// 2 way of creating an array
		
		char[] gradesArray= {'A','B','C','D'};
		System.out.println("Element with index 2 is "+gradesArray[2]);
		
		System.out.println(" - - - - - - - - - - - -- - - - - - - - - -");
		
		String[] names = {"Asel","Jimmy","Aysha","Naiya"};
		names[0]="Priyasri";
		
		System.out.println(names[0]);
		System.out.println(names [2]);
		
		System.out.println(" -  - - -- - - -  - - - - - - - - - - - - - -");
		
		String []cars= {};
		System.out.println(cars.length);
		
		System.out.println(" - - - - - -  - - - - - - - - - - - - -");
		
		
		
		
		
	}

}
