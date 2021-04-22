package akiko.templatemethod;

/**
 * Choose the amount of players as parameter for playOneGame method, this could be implemented using a scanner also
 * @author Aki Koppinen, 1810088
 * @version 1.0 07.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game newGg = new GuessingGame();
		newGg.playOneGame(3); //change parameter to change player amount
	}

}
