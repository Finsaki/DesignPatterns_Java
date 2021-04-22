package akiko.adapter;

import java.util.Scanner;

/**
 * This is an assignment showcasing the adapter design pattern
 * 
 * The program shows alerts based on the users input of amount and severity.
 * The normal Alert class can only deal with alert tests with severity of 1
 * Anything else it will transfer for AlertAdapter to use.
 * AlertAdapter will contact either SpecialAlert or SuperAlert depending on the severity.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 22.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to alert testing!");
		
		IAlert alert = new Alert();
		String input = "";
		int amount = 3;
		int severity = 1;
		
		Scanner scan = new Scanner(System.in);
		
		while (!input.equals("4")) {
			System.out.println("\n-----\nInput 1 to choose amount of alerts (amount now: " + amount + 
					")\nInput 2 to choose alert level (level now: " + severity + ")\nInput 3 to test alert system\nInput 4 to exit program\n-----\n");
			input = scan.nextLine();
			
			if (input.equals("1")) {
				System.out.println("Choose the amount of alerts (1-100)");
				String input2 = scan.nextLine();
				try {
					int input3 = Integer.parseInt(input2);
					if (input3 > 0 && input3 < 100) {
						amount = input3;
					} else {
						System.out.println("Please input a value between 1 and 100");
					}
				} catch (NumberFormatException ex) {
					System.out.println("Please input an Integer");
				}
			}
			
			if (input.equals("2")) {
				System.out.println("Choose the alert level (1-3). 1: normal, 2: special, 3: super");
				String input2 = scan.nextLine();
				try {
					severity = Integer.parseInt(input2); //program should be able to handle wrong inputs later as well
				} catch (NumberFormatException ex) {
					System.out.println("Please input an Integer");
				}
			}
			
			if (input.equals("3")) {
				alert.playAlert(severity, amount);
			}
		}
		
		System.out.println("Bye Bye!");
		scan.close();

	}

}
