package com.syntax.class05;

public class LogicalOperatorNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=-110;
		if(num>0 ) {
			if(num<100) {
				System.out.println("number is from 1 to 99");
			}else {
		        System.out.println("number is out of range");
			}
		}else {
			System.out.println("number is out of range");
		}
		
		
		
	}

}
