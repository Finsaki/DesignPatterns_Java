package akiko.command;

/**
 * Receiver
 * @author akiko
 *
 */
public class SilverScreen {
	
	private boolean screenUp = true;
	
	public void screenUp() {
		if (screenUp) {
			System.out.println("Silver screen is already up");
		} else {
			System.out.println("Silver screen starts rolling up\n...\n...\nDone. Bye bye.");
			screenUp = true;
		}
	}
	
	public void screenDown() {
		if (screenUp) {
			System.out.println("Silver screen starts rolling down\n...\n...\nDone. Enjoy the film.");
			screenUp = false;
		} else {
			System.out.println("Silver screen is already down");
		}
	}

}
