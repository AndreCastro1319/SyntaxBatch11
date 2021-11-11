package com.syntax.class15;

public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str= new StringBuilder();
        for(int i=0;i<5;i++) {
        	str.append(i);
        }
        System.out.println(str);
			
		
		
        String str2="Look At Me Now";
        
        StringBuilder strBuilder=new StringBuilder(str2);
        
        strBuilder.reverse();
        
        System.out.println(strBuilder);

	
		
	}

}
