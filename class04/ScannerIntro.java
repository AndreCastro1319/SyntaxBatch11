package com.syntax.class04;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
    String str="abc";
    str="zyx";
    
    Scanner scan=new Scanner(System.in);
     String name=scan.next(); // it will capture String value from console 
    
    System.out.println("Hello"+name);
    
    System.out.println("Please enter your age");
    int age=scan.nextInt();
    
		System.out.println( name + " you are "+age+" years old");
  

	}
		
		
		
	}


