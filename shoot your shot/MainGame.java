package shootYourShot;

import java.util.Scanner;

//Creating a class which contains the main method to run the game
public class MainGame {
	
	
	

	public static void PlayGame() {

		// Welcoming the player. Giving a brief information about the idea behind the game
		System.out.println("	Welcome!");
		System.out.println("***********************");
		System.out.println("Those nasty Noodle_Legs have attacked our lovely SauceLand....");
		System.out.println("All of our noodles are scared. They love their home.");
		System.out.println("However, they cannot defend themselves against these brute Noodle_Legs.");
		System.out.println("Are you ready to fight for them, help them defend their land," + "\r\n"
				+ "and have yourself remembered as the SauceGuy?");
		System.out.println("\r\n");
		System.out.println("If so, we ask you, ARE YOU READY TO SHOOT YOUR SHOT?");
		System.out.println("\r\n");
		System.out.println("\r\n");
		

		Scanner userInfo = new Scanner(System.in);
		PlayerProfile userData = new PlayerProfile();	// Creating a new player profile object to store player name and response to play the game

		
		
		// Asking questions to complete user profile
		System.out.print("Please enter your character name: "); //Asking about character name

		userData.setPlayerName(userInfo.nextLine());			// Using setter to set player's character name

		System.out.println("\r\n");
		System.out.println("****Select the game level****");	// Asking about the game level
		System.out.println("\r\n");

		DifficultyLevel level = new DifficultyLevel();			// Creating a new difficulty level object to set value of game level
		
		
		
		// Printing game level selecting instructions
		System.out.println("Press 0 for easy" + "\r\n" + "Press 1 for medium" + "\r\n" + "Press 2 for hard");
		int r = userInfo.nextInt();									// Reading the player response to game level question
		level.setDifficultyLevel(r);								// using setter to set the value of game level chosen by the player
		System.out.println("\r\n");
		System.out.println(level.getDifficultyLevel() + " level game will begin now.");
		System.out.println("\r\n");
		System.out.println("\r\n");
		
		
		
		// Using if-else to play the game level chosen according to user response
		if (r == 0) { 					// Play easy game level, if user entered 0
			GameLevel.GameRun1();
		} else if (r == 1) { 			// Play medium game level, if user entered 1
			GameLevel.GameRun2();
		} else if (r == 2) { 			// Play hard game level, if user entered 2
			GameLevel.GameRun3();
		} else 							// For any other input return nothing
			return;
	}

	

	public static void main(String[] args) { // Declaring the main method
		
		PlayGame();						// Calling the game function to start the game
		System.out.println("\r\n");

	}

	
}

