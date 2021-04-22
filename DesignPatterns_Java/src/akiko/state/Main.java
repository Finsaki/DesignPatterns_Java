package akiko.state;

import java.util.Scanner;

/**
 * This is a pokemon CLI game to try out State design pattern
 * 
 * EvolutionState is an abstract class that the Pokemon class uses. Pokemon class has a variable for storing the current state.
 * Different states extend the EvolutionState class and these classes can change the active state in Pokemon class.
 * 
 * The game can be started and closed with input commands and user can also print the current pokemons info, or restore its hitpoints to full.
 * The actual fights between the pokemon and its opponents are randomly generated using int values from the Random class.
 * If the pokemon gathers enough experience points, it will evolve into a better version. This evolving is done with the state change.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 01.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Pokemon battle!\n");
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		Pokemon pokemon = new Pokemon();
		Fight fight = new Fight(pokemon);
		pokemon.rest();
		
		while (!input.equals("4")) {
			System.out.println("\n-----\nInput 1 to start battle\nInput 2 to print pokemon info\nInput 3 to rest your pokemon\nInput 4 to exit program\n-----\n");
			input = scan.nextLine();
			if (input.equals("1")) {
				fight.startFight();
			}
			if (input.equals("2")) {
				pokemon.showInfo();
			}
			if (input.equals("3")) {
				pokemon.rest();
			}
		}
		
		System.out.println("Thanks for the battles!");
		scan.close();
		
	}

}
