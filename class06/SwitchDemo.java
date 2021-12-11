package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * rules:
		 * 1.values is case MUTS be same datatypes as a VARIABLE in switch
		 * 2.We can not have Duplicate Cases
		 */	
		
		
		char gender='h';
     String description;

      switch (gender) {
      
      case 'm':
    	   description="Male";
    	   break;
      case 'M':
    	   description="Male";
      case 'f':
    	   description="Female";
    	  break;
   	  default:
    	 description="Unknown";	  
    	  
      }
	
	System.out.println(gender +" means "+ description);
	
	/*
	 * limitation
	 * 1. we can not use Logical Operators
	 * 2. we can not use Relational Operators
	 * 
	 * limitations of data types
	 * 1. cannot use 'boolean' 
	 * 2. cannot be used with 'double/float'
	 * 3. cannot be use with long
	 */
	
	
	
	
	
	
	
	}

}
