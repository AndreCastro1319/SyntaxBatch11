package com.syntax.class13;

import java.util.Scanner;

public class TASK1 {

	
		// Username and Password cannot be  empty,
		//if so→ message=”Username and Password cannot be empty”.

	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	
System.out.println("Enter username");
String username=scan.nextLine();

System.out.println("Enter password");
String password=scan.nextLine();	

String confirmpass=password;
	
			if( username.isEmpty() || password.isEmpty()){
				
				System.out.println("Username and Password cannot be empty");
				
			}else if(password.length()<8) {
				System.out.println("Password is too short");
				
			}else if (password.contains(username)) {
				System.out.println("Password cannot contain username");
			
			}else if(password.matches(password)) {
				System.out.println("Your username and password has been created");
			
			}else {
				
				System.out.println("Your password Do not match");
			}
			
			
		}
		
	}
		

