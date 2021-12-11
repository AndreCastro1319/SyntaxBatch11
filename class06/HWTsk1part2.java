package com.syntax.class06;

import java.util.Scanner;

public class HWTsk1part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
     System.out.println("Enter a number");
     int a=scan.nextInt();
     System.out.println("Enter a number");
     int b=scan.nextInt();
     System.out.println("Enter Operator");
     String Operator=scan.next();
     
     
     if (Operator.equals("+")) {
    	 System.out.println(" the result is "+(a+b));
     }else if (Operator.equals("-")) {
    	 System.out.println(" the result is "+(a-b));
     }else if (Operator.equals("*")) {
    	 System.out.println(" the result is "+(a*b));
     }else if (Operator.equals("/")){
    	 System.out.println(" the result is "+(a/b));
     }else {
    	 System.out.println("Invalid");
     }
	}

}
