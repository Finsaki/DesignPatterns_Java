package akiko.command;

/**
 * Concrete command for rolling up the silver screen
 * @author akiko
 *
 */
public class RollUpCommand implements Command {

	private SilverScreen sScreen;
	
	public RollUpCommand(SilverScreen sScrn) {
		this.sScreen = sScrn;
	}

	@Override
	public void execute() {
		sScreen.screenUp();
	}

}
