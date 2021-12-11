package com.syntax.class05;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int month=4; 
        
        String monthName=null;
		if(month==1) {
			monthName="Jan";
		}else if (month==2) {  // both ways to syso print...
			System.out.println("Feb");
		}else if (month==3) {
			System.out.println("Mar");
		}else if (month==4) {
			System.out.println("Apr");
		}else if (month==5) {
			System.out.println("May");
		
		}
		
		
		switch(month) {
		case 1:
			System.out.println("Jan");
		case 2:
			System.out.println("Feb");
		case 3:
			System.out.println("Mar");
		case 4:
			System.out.println("Apr");
			
		case 5:
			System.out.println("May");
			
		
	}
	}
}
