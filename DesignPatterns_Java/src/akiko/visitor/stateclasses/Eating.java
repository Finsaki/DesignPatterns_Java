package akiko.visitor.stateclasses;

/**
 * Concrete state
 * @author akiko
 *
 */
public class Eating extends CoderState {

	private static Eating instance;
	private final int eat = 8;
	
	private Eating() {};
	
	public static synchronized Eating getInstance(){
		if (instance == null){
			instance = new Eating();
		}
		return instance;
	}

	@Override
	public void doStuff(Coder coder) {
		coder.setHunger(coder.getHunger() - eat);
		System.out.println("Eating");
	}

}
