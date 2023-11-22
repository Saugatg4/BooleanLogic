package com.skillstorm.booleanlogic;

import java.util.Scanner;

public class IfElseStatement {
	
	public static void main(String []args) {
		
		// We are trying to see if the user is over 21 to drink in US
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the bar!");
		System.out.println("How old are you?");
		
		int age = scanner.nextInt();
		if (age >=21) {
			
			System.out.println("Your elegible to drink");
		} else  {
			
			System.out.println("You cannot drink");
		}
		
		
		
		
		 scanner.close();
	}

}
