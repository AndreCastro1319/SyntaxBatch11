package com.syntax.class13;

public class SringDemo {
	
	public static void main(String[]args) {
		
	
	
		String name = new String("Sebastian"); 
	//	String name2=null;  everything will print error because value is null
		String name1="Mykl";
			System.out.println(name.length());
			System.out.println(name1.length());	
			System.out.println(name.toLowerCase());
			System.out.println(name.toUpperCase());

			String str= " This is easy 123456 !@#!";
			System.out.println(str.toLowerCase());
			
			System.out.println(name+name1); // recommend to use always
			System.out.println(name1.concat(name)); // not recommended always
			
			int number=10;
			
			System.out.println(name+name1+number);
			//System.out.println(name.concat(name1).concat(number)); // not allowed
			
			System.out.println("- - - - - - - -  - --  - - - - -- -  --");
			
			
			String names = "Luis Castro A";
			System.out.println(" Name "+names);
			System.out.println(" Uppercase "+names.toUpperCase());
			System.out.println(" lowercase "+names.toLowerCase());
			System.out.println(" First letter "+names.charAt(0));
			System.out.println(" Length "+names.length());
			System.out.println(" Last letter "+names.charAt(12));
			System.out.println(" Substring "+names.substring(7,11));
	}
	

	}

