package akiko.memento;

/**
 * This is the caretaker class in the memento design model
 * Main class creates a new RiddlerCaretaker class for each state it wants to save with joinGame method.
 * Main class then calls this class again to get the saved data back through rememberGuess method.
 * 
 * Caretaker class does not know of the exact content of the state it saves, it only saves an Object type.
 * 
 * @author akiko
 *
 */
public class RiddlerCaretaker {
	
	private Object obj;
	
	public void joinGame(Riddler originator, Thread thread) {
		this.obj = originator.joinGame(thread);
	}
	
	public void rememberGuess(Riddler originator) {
		originator.rememberGuess(obj);
	}

}
