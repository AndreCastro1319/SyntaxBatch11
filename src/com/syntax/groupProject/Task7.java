package com.syntax.groupProject;

public class Task7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		
		 	int num = 9;
		    boolean prime = true;
		    for (int i=0; i<=num;i++) {
		   
		      if (num % 2 == 0) {
		        prime = false;
		        break;
		      }

		      ++i;
		    }

		    if (!prime)
		      System.out.println(num + " is not  prime number.");
		    else
		      System.out.println(num + " is a prime number.");
		}

			}


