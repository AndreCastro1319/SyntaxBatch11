package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a country");
		String country;
		country=scan.next();
		String language=null;
		
		switch(country) {
		
		case "United States":
			 language="English";
			 break;
		case "France":
			 language="French";
			 break;
		case "Ecuador":
			 language="Spanish";
			 break;
		case "China":
			 language="Mandarin";
			 break;
	    default:
	         language="Incorrect";
		}
				if (!language.equals("Incorrect")) {
				System.out.println(country + " language is "+language);
		}else {
			System.out.println("Try another country");
		}
		
	}
	}


