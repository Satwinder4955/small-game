package shootYourShot;

// Class which describes the player in this game
public class PlayerProfile {

	private String playerName;// String variable to store player name
	private String userResponse;// String variable to store user response to playing game

// Empty constructor
	public PlayerProfile() {

	}

	// Object named Player Profile which describes the player and if they want to
	// play the game
	public PlayerProfile(String playerName) {
		this.playerName = playerName;
	}

	// Setter for Player Name- asks user for their character name in the game
	public void setPlayerName(String playerName) {
		this.playerName = playerName.toUpperCase();
	}

	// Setter for User Response- whether or not they want to play the game
	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

	// Getter for Player Name
	public String getPlayerName() {
		return playerName;
	}

	// Getter for User Response
	public String getUserResponse() {
		return userResponse;
	}

}
