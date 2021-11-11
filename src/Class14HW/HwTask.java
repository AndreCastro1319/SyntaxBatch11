package Class14HW;
 
import java.util.Arrays;

public class HwTask {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.

		String str="Java class is fun";
		System.out.println(str.replace(" ",""));
		System.out.println(str);
		
		System.out.println("- - - - - - - - - - - - ");
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str2="abcdefghijk1234567!@#$%^&";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "").length());
		
		System.out.println("- - - - - - - - - - - - -");
		
		//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?
		
		String str3="Is it saturday? Is it raining? Do we have Java Class today?";
		
	
        System.out.println(str3.split("[?]").length);	
		
		// How would you reverse a String character by character?
		System.out.println("- - - - - -  --  - - - - ");
		
		String newName = "JimmyCastro";
	    
	    StringBuilder stringBuilder = new StringBuilder(newName);
	    
	    stringBuilder = stringBuilder.reverse();
	    
	    System.out.print("The reversed string of the '"+newName+"' is: ");
	    System.out.println(stringBuilder);
	
	   
	    //How would you reverse a String word by word?
	    System.out.println("- - - - - - - - - -  - - - - - -");	
	   String str6="I love Java";
	   String[] str6Arr=str6.split(" ");
	   
	   for(String word:str6Arr) {
		   StringBuilder stringBuilder1=new StringBuilder(word);
	   System.out.print(stringBuilder1.reverse()+" ");
	    
	  
	    }
	
	    System.out.println();
	    System.out.println("- - - - - -  - - - - - - - - - - - - - - ");
	    
	   // How would you swap  2 strings without a temporary variable?
	    
	    String str4="Day";
	    String str5="Night";
	    str4= str4 + str5;
	    str5=str4.replace(str5, "");
	    str4=str4.replace(str2, "");
	    System.out.println(str4);
	    System.out.println(str5);
	    
	    // How would you check if Strung is palindrome or not?
	    
	    String str7 ="aba";
	    StringBuilder strb=new StringBuilder(str7);
	    strb.reverse();
	    if(str7.equals(strb.toString())) {
	    	System.out.println(str7+" is palindrome");
	    }else {
	    	System.out.println(str+ " Not is palindrome");
	    }
	    
			
}	
		
   }

   

