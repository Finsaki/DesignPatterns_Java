package akiko.memento;

import java.util.Random;

/**
 * This is the Originator class which also has memento class as a private inner class
 * Memento saves the current state of the Originator class via methods from RiddlerCaretaker.
 * 
 * @author akiko
 *
 */
public class Riddler {
	
	private Random rand;
	private int guess;
	private int correctGuess;
	
	public Riddler() {
		rand = new Random();
		this.correctGuess = rand.nextInt(10) + 1;
	}
	
	public Object joinGame(Thread customer) {
		//create random number
		customer.start();
		this.guess = rand.nextInt(10) + 1;
		System.out.println("Asiakas " + customer.toString() + " arvasi numeroa " + this.guess);
		//save the random number to memento
		return new Memento(this.guess, customer); //return the Memento
	}
	
	public void rememberGuess(Object obj) {
		Memento memento = (Memento)obj;
		this.guess = memento.guess;
		if (this.guess == this.correctGuess) {
			System.out.println("Asiakas " + memento.customer.toString() + " arvasi oikein!" + " numero oli " + correctGuess);
		} else {
			System.out.println("Asiakas " + memento.customer.toString() + " arvasi numeroa " + this.guess + ", oikea numero oli " + correctGuess);
		}
		memento.customer.interrupt();
	}
	
	private class Memento {
		private int guess;
		private Thread customer;
		
		public Memento(int number, Thread thread) {
			this.guess = number;
			this.customer = thread;
		}
	}

}
