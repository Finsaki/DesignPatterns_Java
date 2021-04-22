package akiko.state;

/**
 * Might have just used an interface as almost everything here is implemented in every single implementing class. Except the nextEvolution()
 * @author akiko
 *
 */
public abstract class EvolutionState {
	
	public abstract int normalAttack(Pokemon p);
	
	public abstract int specialAttack(Pokemon p);
	
	public abstract int defend(Pokemon p);
	
	public abstract void rest(Pokemon p);
	
	public abstract void lose(Pokemon p);
	
	public abstract void win(Pokemon p, int experience);
	
	public abstract void takeDamage(Pokemon p, int damage);
	
	public abstract void showInfo(Pokemon p);
	
	public void nextEvolution(Pokemon p, EvolutionState e) {
		p.nextEvolution(e);
	}

}
