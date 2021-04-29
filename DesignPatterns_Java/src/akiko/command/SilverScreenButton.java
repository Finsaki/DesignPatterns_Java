package akiko.command;

/**
 * Invoker class
 * @author akiko
 *
 */
public class SilverScreenButton {
	
	Command command;
	
	public SilverScreenButton(Command cmd) {
		command = cmd;
	}
	
	public void push() {
		command.execute();
	}

}
