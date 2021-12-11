package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		
		Human jimmy=new Human();
		jimmy.name="Jimmy";
		jimmy.age=30;
		jimmy.height=5.6;
		jimmy.weight=162;
		jimmy.gender='M';
		jimmy.bloodtype="A+";
		
		
		jimmy.eat();
		jimmy.sleep();
		jimmy.walk();
		
		System.out.println("- - - - - - - - - - - - - - - - - - ");
		Human Sebastian= new Human();
		Sebastian.name="Sebastian";
		Sebastian.age=18;
		Sebastian.height=6.2;
		Sebastian.weight=100;
		Sebastian.gender='M';
		Sebastian.bloodtype="A-";
		Sebastian.eat();
		Sebastian.sleep();
		Sebastian.walk();
		Sebastian.sendmemes();
	
		Scanner scanner =new Scanner(System.in);
		
	
	}
}
