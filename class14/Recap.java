package com.syntax.class14;

import java.util.Arrays;

public class Recap {

	
	public static void main(String[]ards) {
		
		
		String name ="     Nasiri    ";
		System.out.println(name.length()); // chars count
		System.out.println(name.startsWith("N"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.contains("p"));
		System.out.println(name.equals("NaSiR"));
		System.out.println(name.equalsIgnoreCase("NasIr"));
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("i",4));
		System.out.println(name.substring(1));
		System.out.println("- - - -  - - - - - - - - -");
	    System.out.println(name.substring(3,6));
	    System.out.println(name.isEmpty());  
	    System.out.println(name.trim());
	
	    String sentences="This is a Java Class";
	 //   System.out.println(Arrays.toString().split(" ").length);
	    
	}
}
