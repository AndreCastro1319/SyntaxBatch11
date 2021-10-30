package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we need to capture a country from a user
		 * based on the country we have to define a favorite food
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Where you from?");
		String country;
		country=scan.next();
	    String food=null;
		
	  
	    switch (country) {
		 
	    case "Ecuador":
	    	 food="Encebollado";
		     break;
	    case "United States":
	    	 food="Hamburgers";
	    	 break;
	    case "France":
	    	 food="Escargot";
	    	 break;
	    case "Peru":
	    	food="Ceviche";
	    	break;
	    case "Mexico":
	    	food="Tacos";
	    	break;
	    default:
	    	food="Try again";
	    }
	    
	    if (!food.equals("Try again")) {
	    System.out.println("If your country is " + country + (" your favorite food is " + food));
	    
	    }else {
	    	System.out.println("Please try another country ");
	    }
	    

	}

}
