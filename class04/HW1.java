package com.syntax.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		int a=5;
		int b=4;
		
		Scanner scan=new Scanner (System.in);
		a=scan.nextInt();
		
		if(a>b) {
			System.out.println(a + " greater than "+b);
		}else {
			System.out.println(a + " less then "+b);
			
		}
	}

}
