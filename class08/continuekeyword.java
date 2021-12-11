package com.syntax.class08;

public class continuekeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	for(int i=1; i<10; i++) {
		 
		//if (i==3) {
			
		//	continue;   //skips the cycle
			
	//	}
	//	System.out.print(i+ " " );
		
		
	//	}
      // I want to print numbers from 1 to 10 except number 3 and 7 and 9

		for(int i=1; i<10; i++) {
		 
		if (i==3 || i==7 || i==9) {     // && not true so all numbers will print
			
			continue;
		}
		System.out.print(i+ " " );
			
		}

		System.out.print("End of the code" );
		
}
}