package akiko.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Here is a very barebones answer to the assignment. Should do what is asked and not much else
 * When this class is run, the ClockTimer class starts a Thread which checks the current time, then updates the Observer here in Main class,
 * and the current time is printed out here in the Main class. After that, the Thread in ClockTimer then waits for 1 second before checking the current time again.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 28.03.2021
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Clock is ticking...");
		ClockTimer ct = new ClockTimer();
		ct.addObserver(new Observer() {
			public void update(Observable obj, Object arg) {
				System.out.println(arg);
			}
		});
		new Thread(ct).start();
	}

}
