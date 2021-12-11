package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number=10; //define
		int number2=2; //define
		//assigning //(int)
		number2=(int)number; // works now
		
		int number3=10;
		double number4=number3; // Automatic/implicit (widening)
		
		int number5=1256;
		byte number6=(byte)number5;
		System.out.println(number6);
		
		short number7=12;
		byte number8=(byte)number7;
		System.out.println(number6);
		
		int number9=1000;
		float f=number9;
		long l=(long)f;
		
		
		
		
		
		
	}

}
