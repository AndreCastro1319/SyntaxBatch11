package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  		int num=10;
  		System.out.println(num);
  		
  		System.out.println("        ---------------------     ");
  		
	    int [] array=new int [4];
	    
		array [0]=12; 
		array [1]=10;
		array [2]=13;
		array [3]=14;
		
		System.out.println(array[2]+array[0]);
		
		// I need to creat an array what will hold 3 elements of double type of values
		
		
		System.out.println(" -- - -- - - - - - - -- ");
		
	double [] arr=new double [3]; // storing 3 elements an array named arr
	 
	 arr[0]=11.99;
	 arr[1]=1.09;
	 arr[2]=3.08;
	 
	 // can i replace value form an array?
	 arr[1]=100.99;
	
	 System.out.println("After changing value of an element "+arr[1]);
	
	 
	 // create an array that will store 4 colors
	 
	 String [] colors=new String [4];
	 
	 
	 colors[1]="blue";
	 colors[2]="black";
	 colors[3]="yellow";
   //  colors[4]="green";  Array index out of bounds exception Error
	
   // see how mamy elements inside array// what is the size of an array
	 System.out.println("Size of array is "+colors.length);
	
	 System.out.println(colors[0]); // null value (not specified in code)
	 
	 System.out.println(" -- - - - - - - - -" );
	 
	 byte [] smallArray=new byte[89997];
	 
	 
	 
	}

}
