package shootYourShot;

// Class which describes the behavior of the range for the attack  
public class Game {
	private int realTarget;		// integer variable to store the value of actual answer
	private int givenTarget;	// integer variable to store the answer inputed by the player
	private int min = 0;		// integer variable to store upper bound of range
	private int max;			// integer variable to store lower bound of range

	// Object of type Game which takes four arguments
	public Game(int realTarget, int givenTarget, int min, int max) {
		this.realTarget = realTarget;
		this.givenTarget = givenTarget;
		this.min = min;
		this.max = max;
	}

	// Empty constructor
	public Game() {
	}

	// Setter for actual answer
	public void setRealTarget(int realTarget) {
		this.realTarget = realTarget;
	}

	// Setter for user answer
	public void setGivenTarget(int givenTarget) {
		this.givenTarget = givenTarget;
	}

	// Setter for lower bound
	public void setLowerBound(int min) {
		this.min = min;
	}

	// Setter for upper bound
	public void setUpperBound(int max) {
		this.max = max;
	}

	// Getter for actual answer
	public int getRealTarget() {
		return realTarget;
	}

	// Getter for user's inputed answer
	public int getGivenTarget() {
		return givenTarget;
	}

	// Getter for lower bound
	public int getLowerBound() {
		return min;
	}

	// Getter for upper bound
	public int getUpperBound() {
		return max;
	}

}
