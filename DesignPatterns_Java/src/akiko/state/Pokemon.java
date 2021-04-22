package akiko.state;

/**
 * I suppose putting variables here was fine or did I need one class above this one?
 * @author akiko
 *
 */
public class Pokemon {
	
	private EvolutionState state;
	private int currentHP;
	private int currentXP;
	private int currentSpeed;
	
	public Pokemon() {
		state = Squirtle.getInstance();
	}
	
	public int normalAttack() {
		return state.normalAttack(this);
	}
	
	public int specialAttack() {
		return state.specialAttack(this);
	}
	
	public int defend() {
		return state.defend(this);
	}
	
	public void rest() {
		state.rest(this);
	}
	
	public void lose() {
		state.lose(this);
	}
	
	public void win(int experience) {
		state.win(this, experience);
	}
	
	public void takeDamage(int damage) {
		state.takeDamage(this, damage);
	}

	public void nextEvolution(EvolutionState e) {
		state = e;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getCurrentXP() {
		return currentXP;
	}

	public void setCurrentXP(int currentXP) {
		this.currentXP = currentXP;
	}
	
	public void showInfo() {
		state.showInfo(this);
	}
	
	public EvolutionState getState() {
		return state;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}
