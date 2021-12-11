package com.syntax.class12;

public class Method5Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Method5 canBeAnyName= new Method5(); 
		String a=canBeAnyName.method1();
		System.out.println(a);  // return keyword
		// you can also print like this
		//System.out.println(canBeAnyName.method1());
		
		System.out.println(canBeAnyName.method2("Roman"));
		
		
		canBeAnyName.method3();
		canBeAnyName.method4("Jimmy"); //4
		
		System.out.println(canBeAnyName.method5("Henok"));
	}

}
