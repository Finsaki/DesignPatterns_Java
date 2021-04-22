package akiko.memento;

/**
 * This program showcases the Memento design model
 * This main class creates as many caretakers as there is "players" (set by final int AMOUNT).
 * Players here are simple threads which are created here and taken to Riddler (Originator) class through its own caretaker.
 * Main method will call the caretaker again to compare the saved value and actual value together.
 * 
 * Results are shown in console print commands.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 12.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		final int AMOUNT = 10;
		
		//Thread[] customers = new Thread[AMOUNT];
		Riddler originator = new Riddler();
		RiddlerCaretaker[] caretakers = new RiddlerCaretaker[AMOUNT];
		System.out.println("Guessing begins...\n");
		for (int i = 0; i < AMOUNT; i++) {
			caretakers[i] = new RiddlerCaretaker();
			caretakers[i].joinGame(originator, new Thread());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nGuessing has ended...\nPrinting results\n");
		for (int i = 0; i < AMOUNT; i++) {
			caretakers[i].rememberGuess(originator);
		}
	}

}
