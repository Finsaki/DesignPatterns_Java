package akiko.visitor.stateclasses;

/**
 * Concrete state
 * @author akiko
 *
 */
public class Coding extends CoderState{
	
	private static Coding instance;
	private final int work = 1;
	
	private Coding() {};
	
	public static synchronized Coding getInstance(){
		if (instance == null){
			instance = new Coding();
		}
		return instance;
	}

	@Override
	public void doStuff(Coder coder) {
		coder.setFatigue(coder.getFatigue() + work);
		coder.setHunger(coder.getHunger() + work*2);
		System.out.println("Working");
	}

}
