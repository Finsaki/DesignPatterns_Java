package akiko.templatemethod;

/**
 * This houses the player object who get listed into an array in GuessingGame
 * @author akiko
 *
 */
public class GuessingGamePlayer {
	
	private String name;
	private int guess;
	
	public GuessingGamePlayer(String name) {
		this.setName(name);
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
