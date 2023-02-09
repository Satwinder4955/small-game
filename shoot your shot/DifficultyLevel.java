package shootYourShot;

// Class which describes difficulty level in the game 
public class DifficultyLevel {

	private int selectedLevel;										// variable that stores the level value chosen by the player
	private String userLevels[] = {"Easy", "Medium", "Hard"};		// String array declaring different game levels

	// Object named Difficulty Level which describes the difficulty level in this game to user
	public DifficultyLevel(int selectedLevel) {
		this.selectedLevel = selectedLevel;
	}

	// Empty constructor
	public DifficultyLevel() {
	}

	// Setter for difficulty level
	public void setDifficultyLevel(int selectedLevel) {

		switch (selectedLevel) { 					// Switch setter values for individual responses

		case 0:
			this.selectedLevel = selectedLevel;		// setter for easy level
			break;
		case 1:
			this.selectedLevel = selectedLevel;		// setter for medium level
			break;
		case 2:
			this.selectedLevel = selectedLevel;		// setter for hard level
			break;

		}

	}

	// Getter for difficulty level
	public String getDifficultyLevel() {

		return userLevels[selectedLevel];		// returns the value of the level chosen by the user

	}

}
