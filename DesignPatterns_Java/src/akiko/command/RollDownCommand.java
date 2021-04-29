package akiko.command;

/**
 * Concrete command for rolling down the silver screen
 * @author akiko
 *
 */
public class RollDownCommand implements Command {
	
	private SilverScreen sScreen;
	
	public RollDownCommand(SilverScreen sScrn) {
		this.sScreen = sScrn;
	}

	@Override
	public void execute() {
		sScreen.screenDown();
	}

}
