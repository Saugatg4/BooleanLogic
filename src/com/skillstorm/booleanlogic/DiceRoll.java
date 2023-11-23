package com.skillstorm.booleanlogic;

import java.util.Scanner;

public class DiceRoll {
	
	public static void main(String [] args) {
		
		//scanner printing some stuff
		
	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("Hello, Let's roll a dice. Are you feeling lucky?");
	
	System.out.println("Enter a number between 1 and 6");
	int userGuess = myScanner.nextInt();
	
	System.out.println("Let's make this more interesting. "
			+ "How much would you like to bet? (I will give you 3/1 odds)");
	
	System.out.println("Please enter a dollar amount");
	double dollarAmount = myScanner.nextInt();
	
	double diceRoll = Math.random();
	int diceRollResult = (int) (6 * diceRoll) +1;
	System.out.println("Rolling... and the number was : " + diceRollResult);
	
	if (userGuess == diceRollResult) {
		
		double winnings = (dollarAmount * 3) - dollarAmount;
		double  total = winnings + dollarAmount;
		System.out.println("Congratulations!");
		
		System.out.format("You won $" + winnings + ", your total pay out is $" + total);
		
//		System.out.println("You won $" + winnings + ", your total pay out is $"  + total);
//		System.out.println("Thanks for playing :)");
//		
		
	} else {
		
		System.out.format("Sorry you guessed wrong. you lost $" + dollarAmount);
	}
	
	myScanner.close();

  }
}