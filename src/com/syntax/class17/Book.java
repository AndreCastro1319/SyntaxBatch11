package com.syntax.class17;

public class Book {

//	Write Book class that will have instance variables and 2 Constructors. 
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed

	
	String title;
	String color;
	int pages;
	int	year;
	public Book(String title, String color, int pages, int year) {
		
		this.title = title;
		this.color = color;
		this.pages = pages;
		this.year = year;
		 
	}
	public Book(String title) {
		
		this.title = title;
		
		
	}
	
	void printName() {
		System.out.println(this.title);
	}
	
	}
	 
	 
	
	
	
	
	

