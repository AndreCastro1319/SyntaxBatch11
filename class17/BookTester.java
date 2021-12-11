package com.syntax.class17;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Book book = new Book("Harry Potter","black",1000,2009);
		System.out.println("The book is "+ book.title+" the cover is "+book.color+ " is "+book.pages+" pages long");
		
	System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
		
		Book book1 = new Book("The book name is The Secret");
		book1.printName();
		
	}

}
