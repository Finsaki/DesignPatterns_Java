package akiko.templatemethod;

import java.util.Random;
import java.util.Scanner;

/**
 * This game lets players choose a number between 1 and 1000 and the one who gets closest, wins
 * This class extends Game class and is run using its playOneGame method
 * @author akiko
 *
 */
public class GuessingGame extends Game{
	
	private GuessingGamePlayer[] playerList;
	private Random r = new Random();
	private Scanner scan = new Scanner(System.in);
	private int correctGuess;

	@Override
	void initializeGame() {
		playerList = new GuessingGamePlayer[playersCount];
		System.out.println("Welcome to number guessing game!\nThis is a " + playersCount + " player game");
		
		String input = "";
		int i = 0;
		
		System.out.println("\n-----\nInput all players names to start the game\n-----\n");
		while (i < playersCount) {
			System.out.println("Input player " + (i+1) + "/" + playersCount + " name");
			input = scan.nextLine();
			playerList[i] = (new GuessingGamePlayer(input));
			i++;
		}
		System.out.println("All players added, game commencing...");
		System.out.println("\n-----\nStart guessing a number between 1 and 1000\n-----\n");
	}

	@Override
	void makePlay(int player) {
		System.out.println("Player " + playerList[player].getName() + ", please choose your number");

		String input = "";
		
		while (!isInteger(input)) {
			input = scan.nextLine();
		}
		
		playerList[player].setGuess(Integer.parseInt(input));
		System.out.println("Number you chose was " + input + "\n");
		playersCount --; //here we reduce the playersCount variable located in the abstract class, this means there is one less player left to make their move
	}

	@Override
	boolean endOfGame() {
		if (playersCount == 0) {
			calculateCorrectNumber();
			return true;
		} else {
			return false;
		}
	}

	@Override
	void printWinner() {
		GuessingGamePlayer winner = calculateWinner();
		System.out.println("Winner is " + winner.getName() + ".\nThe guess was off by only " + (Math.abs(winner.getGuess() - correctGuess)));
		System.out.println("\nThank you for playing!");
		scan.close();
	}
	
	/**
	 * Checking if the input is acceptable
	 * @param s input being checked
	 * @return boolean true if the input was ok
	 */
	private boolean isInteger(String s) {
	    try {
	    	int n = Integer.parseInt(s); //checking if input is an integer
	        if (n > 0 && n <= 1000) { //checking if integer is between chosen parameters
	        	if (checkForDuplicates(n)) { //checking if the inputted value is unique and not allready chosen by others
	        		return true;
	        	} else {
	        		System.out.println("Please input a guess that is different from others");
	        		return false;
	        	}
	        } else {
	        	System.out.println("Please input a number between 1 and 1000");
	        	return false;
	        }
	    } catch (NumberFormatException ex) {
	    	System.out.println("Please input an integer");
	        return false;
	    }
	}
	
	/**
	 * Checks if same guess is already submitted
	 * @param n the guess
	 * @return true if no dublicates were found, false if any were found
	 */
	private boolean checkForDuplicates(int n) {
		for (GuessingGamePlayer player: playerList) {
			if (player.getGuess() == n) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Printing end of guessing and showing the correct guess in console
	 */
	private void calculateCorrectNumber() {
		System.out.println("-----\nAll guesses submitted, revealing the correct number..\n-----\n");
		correctGuess = r.nextInt(1000) + 1;
		System.out.println("Correct number was: " + correctGuess);
	}
	
	/**
	 * Calculating whos guess got closest to the random correct value
	 * @return the player object who won
	 */
	private GuessingGamePlayer calculateWinner() {
		GuessingGamePlayer winner = null;
		int closestGuessDifference = 1000;
		
		for (GuessingGamePlayer player: playerList) {
			int guessDifference = Math.abs(player.getGuess() - correctGuess);
			if (guessDifference < closestGuessDifference) {
				closestGuessDifference = guessDifference;
				winner = player;
			}
		}
		
		return winner;
	}

}
