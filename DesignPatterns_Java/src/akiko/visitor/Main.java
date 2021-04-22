package akiko.visitor;
import akiko.visitor.stateclasses.Coder;

/**
 * Here is a very simple solution that has a two visitors changing the state of the Coder class.
 * Sorry about the barebones solution, this coder is tired too.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 15.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		Coder coder = new Coder();
		int i = 0;
		while (i < 100) {
			coder.doStuff();
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}
