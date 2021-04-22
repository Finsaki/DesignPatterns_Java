package akiko.visitor.stateclasses;

/**
 * Concrete state
 * @author akiko
 *
 */
public class Sleeping extends CoderState{
	
	private static Sleeping instance;
	private final int rest = 2;
	
	private Sleeping() {};
	
	public static synchronized Sleeping getInstance(){
		if (instance == null){
			instance = new Sleeping();
		}
		return instance;
	}

	@Override
	public void doStuff(Coder coder) {
		coder.setFatigue(coder.getFatigue() - rest);
		System.out.println("Resting");
	}

}
