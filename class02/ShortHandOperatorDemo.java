package com.syntax.class02;

public class ShortHandOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10;
		number=number+1;
		System.out.println(number);
		number++; //shorter way of doing this number=number+1;
		System.out.println(number);
		System.out.println("************");
		number=10;
		number=number+30;
		System.out.println(number);
		number+=30; // number=number+30;
		System.out.println(number);
		System.out.println("************");
		number=10;
		number-=5;
		System.out.println(number);
		System.out.println("************");
		number=10;
		number*=5;
		System.out.println(number);
		System.out.println("************");
		number=10;
		number/=5;
		System.out.println(number);
		System.out.println("************");
		number=10;
		number%=5;
		System.out.println(number);
		System.out.println("************");
		
		int B=100;
		B++;
		System.out.println(B);
		int b=-100;
		b++;
		System.out.println(b);
	    b--;
		System.out.println(b);
		
		System.out.println("************");
		//number(a)** not allowed because it does not change anything
		//number(a)// not allowed because it does not change anything
		
		double C=10;
		++C;
		System.out.println(C);
		
		System.out.println("************");
		double D=20;
	    D+=10;
	    System.out.println(D);
	    D-=40;
	    System.out.println(D);
	    
	    D=100;
	    D*=4;
	    System.out.println(D);
	    
	    
	    
	
	}

}
