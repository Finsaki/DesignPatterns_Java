package akiko.command;

import java.util.Scanner;

/**
 * This program showcases the command java design pattern
 * @author Aki Koppinen
 * @version 1.0 29.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SilverScreen sScreen = new SilverScreen();
		Command rollUp = new RollUpCommand(sScreen);
		Command rollDown = new RollDownCommand(sScreen);
		SilverScreenButton upButton = new SilverScreenButton(rollUp);
		SilverScreenButton downButton = new SilverScreenButton(rollDown);
		String input = "";
		System.out.println("Silverscreen management iot software TM");
		while (!input.equals("3")) {
			System.out.println("\nChoose 1 to rolldown the silver screen\nChoose 2 to rollup the silver scree\nChoose 3 to exit\n");
			input = scan.nextLine();
			if (input.equals("1")) {
				downButton.push();
			}
			if (input.equals("2")) {
				upButton.push();
			}
		}

	}

}
