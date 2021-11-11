package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		String str=("This is Batch 11 Batch 11 is good");
		System.out.println(str.replace("good", "Great"));
		str="This is Batch 11 is good Batch 11 is good";
		System.out.println(str.replace("good", "Great"));
		System.out.println(str.replaceFirst("good", "bonito"));
	}

}
