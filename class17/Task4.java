package com.syntax.class17;

public class Task4 {

	/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
	 *  and create 4 objects of this class:
	 *   1 - inside same class; 
	 *   2 - from outside the class; 
	 *   3 - from different class inside different package  and observe result.
	 */
	
	String name;
	String color;
	String size;
	String shape;
	public Task4(String name, String color, String size, String shape) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
		this.shape = shape;
	}
	
	Task4(String name, String color, String size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	protected Task4(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}	
	private Task4(String name) {
		
		this.name = name;
	}
	
	public static void main(String[]args) {
		
		Task4 a= new Task4("Jimmy","Black","Medium","Square");
		Task4 b=new Task4("Mateo","Red","Small");
		Task4 c=new Task4("Seba","Orange");
		Task4 d=new Task4("Carolina");
		
	}
	
	  void printAll() {
		System.out.println(this.name);  
	  }
	}
	
	
	

