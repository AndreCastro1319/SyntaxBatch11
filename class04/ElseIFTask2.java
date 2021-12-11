package com.syntax.class04;

public class ElseIFTask2 {

	public static void main(String[] args) {
		
		double mortgagerate=3;
		int mortgageprice=300000;
		
      if(mortgagerate>4.5) {
    	  System.out.println("You will no be buysing a house");
      } else { 
    	  System.out.println("will Consider buying a house");
       if(mortgageprice>200000) {
    	System.out.println("User will take a loan");
      } else {
    	  System.out.println("Will pay cash");
      
     
      }
		
	}

	}
}