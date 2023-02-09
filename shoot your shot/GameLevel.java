package shootYourShot;

import java.util.Random;
import java.util.Scanner;

// Class which contains the main code of how the game works
public class GameLevel {
	
	static int findLowerBound=0;		// Initializing a static variable, because it is called in other methods, 
										// of type integer which helps in setting the values for the range shown to the player
	static int kills = 0;				// variable which counts the number of successful kills by the player 
	static int totalGivenMoves = 1;		// variable which declares the attack number, starting from 1
	static int levelMoves=0;

	
	// Creating a method for easy level game
	public static void GameRun1() {
		
		Game g = new Game();									// Creating a new object of type Game, to set the target and printed range
		Scanner userInformation = new Scanner(System.in);	// Scanner to read input
		Random target = new Random();						// Random method, to create the actual target distance. It will be a random number
		
		levelMoves = 3;// Variable which declares total number of attacks possible in this particular level

		
		// Printing game instructions
		System.out.println("****INSTRUCTIONS****");
		System.out.println("\r\n");
		System.out.println(levelMoves + " Noodle_legs are attacking the SauceLand.");
		System.out.println("You will have " + levelMoves + " chances to attack. To win you must kill atleast 2 Noodle_legs.");
		System.out.println("********************");
		System.out.println("\r\n");
		
		
		
		
		// This for loop is used to iterate through the possible number of attacks(1-3)
		for (totalGivenMoves = 1; totalGivenMoves <= levelMoves; totalGivenMoves++) {
			
			int userRandom = target.nextInt(100 - 50) + 50; // Variable that stores the real answer as a random number
			g.setRealTarget(userRandom);					// Setting the answer using setter
			
			
			findLowerBound= target.nextInt(4 - 0) + 0;		// Storing a random number in findLowerBound
			g.setLowerBound(userRandom - findLowerBound);	// Setting the lower bound for the range
			g.setUpperBound(userRandom + findLowerBound);	// setting the upper bound for the range
			
			
			// Printing game related messages
			System.out.print(totalGivenMoves + " Noode_Leg is somewhere between " + g.getLowerBound() + " & "
					+ g.getUpperBound() + " feet away.");
			System.out.print("Enter the distance where you think it most likely is. "); 
			System.out.print("This will make the missile hit that place.");
			System.out.println("\r\n");
			g.setGivenTarget(userInformation.nextInt());				// Storing player's answer 
			
			
			//Using if/else to print messages based on whether player entered the right answer or not
			if (g.getGivenTarget() == g.getRealTarget()) {
				System.out.println("Hurray you killed that Noodle_Leg");	// If player answer is right, print this
				kills++;				// Every time the player entered the right answer, his killing score is incremented by one
			} else {
				System.out.println("Opps! You missed it");					// If player answer is wrong, print this
			}
			System.out.println("\r\n");

		}
		
		
		// Once possible game attempts are over, printing the number of correct player answers, with an appropriate message		
		System.out.println("Total kills: " + kills);

		if (kills >= 2) { 											// If winning requirements are met,
			System.out.println("Yay! You won."); 					// print this message
			System.out.println("We commend you for your courage.");
			System.out.println("Only because of you, is our land safe now.");
			System.out.println("We thank you for fighting for us");
		} else {
			System.out.println("Sorry! You lost the game.");		 // else print this message
		}
		
		

	}

	
	
	// Creating a method for medium level game
	public static void GameRun2() {
		
		Game g = new Game();									// Creating a new object of type Game, to set the target and printed range
		Scanner userInformation = new Scanner(System.in);	// Scanner to read input
		Random target = new Random();						// Random method, to create the actual target distance. It will be a random number

		levelMoves = 5;
		

		// Printing game instructions
		System.out.println("****INSTRUCTIONS****");
		System.out.println("\r\n");
		System.out.println(levelMoves + " Noodle_legs are attacking the SauceLand.");
		System.out.println(
				"You will have " + levelMoves + "chances to attack. To win you must kill atleast 3 Noodle_legs.");
		System.out.println("********************");
		System.out.println("\r\n");
		
		
		//Iterating through possible number of attacks(1-5)
		for (totalGivenMoves = 1; totalGivenMoves <= levelMoves; totalGivenMoves++) {
			
			int userRandom = target.nextInt(200 - 80) + 80;					// Storing a random integer, which is the right answer
			g.setRealTarget(userRandom);
			findLowerBound= target.nextInt(26 - 0) + 0;
			g.setLowerBound(g.getRealTarget() - findLowerBound);			// Setting the lower bound
			g.setUpperBound(g.getRealTarget() + 3 * findLowerBound);		// Setting the upper bound

			
			// Printing game related messages
			System.out.print(totalGivenMoves + " Noode_Leg is somewhere between " + g.getLowerBound() + " & "
					+ g.getUpperBound() + " feet away.");
			System.out.print("Enter the distance where you think it most likely is. ");
			System.out.print("This will make the missile hit that place. ");	// Asking the player, for an answer
			System.out.println("\r\n");
			g.setGivenTarget(userInformation.nextInt());						// Using setter, to store that answer
			
			
			// Checking, if the answer was right or wrong
			if (g.getGivenTarget() == g.getRealTarget()) { 					//If answer is right
				System.out.println("Hurray you killed that Noodle_Leg");	// Print this
				kills++;

			} else {														 // If answer is wrong
				System.out.println("Opps! You missed it");					 // print this
			}
			System.out.println("\r\n");

		}
		
		// Declaring game results
		System.out.println("Total kills: " + kills);				// Number of answers, that user got right
		if (kills >= 3) { 											// Checking if winning requirements are met. then printing appropriate messages
			System.out.println("Yay! You won."); 					// print this message
			System.out.println("We commend you for your courage.");
			System.out.println("Only because of you, is our land safe now.");
			System.out.println("We thank you for fighting for us");
		} else {
			System.out.println("Sorry! You lost the game.");		 // else print this message
		}

	}
		

	

	public static void GameRun3() {
		
		Game g = new Game();									// Creating a new object of type Game, to set the target and printed range
		Scanner userInformation = new Scanner(System.in);	// Scanner to read input
		Random target = new Random();						// Random method, to create the actual target distance. It will be a random number


		levelMoves = 7;
		
		
		// Printing game instructions
		System.out.println("****INSTRUCTIONS****");
		System.out.println("\r\n");
		System.out.println(levelMoves + " Noodle_legs are attacking the SauceLand.");
		System.out.println(
				"You will have " + levelMoves + "chances to attack. To win you must kill atleast 5 Noodle_legs.");
		System.out.println("********************");
		System.out.println("\r\n");
		
		
		//Iterating through possible number of attacks(1-7)
		for (totalGivenMoves = 1; totalGivenMoves <= levelMoves; totalGivenMoves++) {
			
			int userRandom = target.nextInt(300 - 150) + 150;								// Storing a random integer, which is the right answer
			g.setRealTarget(userRandom);
			findLowerBound= target.nextInt(80 - 0) + 0;
			g.setLowerBound(g.getRealTarget() - findLowerBound);						// Setting the lower bound
			g.setUpperBound(g.getRealTarget() + 5 * findLowerBound);					// Setting the upper bound

			
			// Printing game related messages
			System.out.print(totalGivenMoves + " Noode_Leg is somewhere between " + g.getLowerBound() + " & "
					+ g.getUpperBound() + " feet away.");
			System.out.print("Enter the distance where you think it most likely is. ");
			System.out.print("This will make the missile hit that place. ");			// Asking player for their answer
			System.out.println("\r\n");
			g.setGivenTarget(userInformation.nextInt()); 								// Storing their answer using setter
			
			
			// Checking, if the answer was right or wrong
			if (g.getGivenTarget() == g.getRealTarget()) { 					// If right, print the following message
				System.out.println("Hurray you killed that Noodle_Leg");
				kills++;
			} else {
				System.out.println("Opps! You missed it"); 					// If wrong, print this message
			}
			System.out.println("\r\n");

		}
		
		// Declaring game results
		System.out.println("Total kills: " + kills);				// Number of answers, that user got right
		if (kills >= 5) { 											// Checking if winning requirements are met. then printing appropriate messages
			System.out.println("Yay! You won."); 					// print this message
			System.out.println("We commend you for your courage.");
			System.out.println("Only because of you, is our land safe now.");
			System.out.println("We thank you for fighting for us");
		} else {
			System.out.println("Sorry! You lost the game.");		 // else print this message
		}
	}
}
	
