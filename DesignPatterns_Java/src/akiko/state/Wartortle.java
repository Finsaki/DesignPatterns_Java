package akiko.state;

/**
 * Looks pretty cool I guess
 * @author akiko
 *
 */
public class Wartortle extends EvolutionState {
	
	private static Wartortle instance;
	private static final String name = "Wartortle";
	private static final int hitPoints = 59;
	private static final int speed = 58;
	private static final int normalAttack = 63;
	private static final int specialAttack = 65;
	private static final int defence = 80;
	private static final int xpToEvolve = 142;
	
	private Wartortle() {};
	
	public static synchronized Wartortle getInstance(){
		if (instance == null){
			instance = new Wartortle();
			System.out.println("You now have a " + name + "!");
		}
		return instance;
	}

	@Override
	public int normalAttack(Pokemon p) {
		System.out.println(name + " prepares to use normal attack");
		return normalAttack;
	}

	@Override
	public int specialAttack(Pokemon p) {
		System.out.println(name + " prepares to use special attack");
		return specialAttack;
	}

	@Override
	public int defend(Pokemon p) {
		System.out.println(name + " prepares to use defence");
		return defence;
	}

	@Override
	public void rest(Pokemon p) {
		System.out.println(name + " is now rested and ready to battle more.");
		p.setCurrentHP(hitPoints);
		p.setCurrentSpeed(speed);
	}
	
	
	public void lose(Pokemon p) {
		System.out.println(name + " has reached 0 hitpoints and needs to take a rest.");
		p.setCurrentHP(0);
	}

	@Override
	public void win(Pokemon p, int experience) {
		System.out.println(name + " wins the fight and gains " + experience + " experience points!");
		p.setCurrentXP(p.getCurrentXP() + experience);
		if (p.getCurrentXP() >= xpToEvolve) {
			System.out.println(name + " is evolving!");
			nextEvolution(p, Blastoise.getInstance());
		} else {
			System.out.println(name + " needs " + (xpToEvolve - p.getCurrentXP()) + " more experience points to evolve.");
		}
	}
	
	public String toString() {
		return name;
	}

	@Override
	public void takeDamage(Pokemon p, int damage) {
		System.out.println(name + " takes " + damage + " damage.");
		p.setCurrentHP(p.getCurrentHP() - damage);
		if (p.getCurrentHP() <= 0) {
			lose(p);
		} else {
			System.out.println(name + "s hitpoints are " + p.getCurrentHP() + " / " + hitPoints + ".");
		}
	}

	@Override
	public void showInfo(Pokemon p) {
		System.out.println("Pokemon name: " + name 
				+ "\nPokemon hitpoints: " + p.getCurrentHP() + " / " + hitPoints
				+ "\nPokemon speed: " + speed
				+ "\nPokemon normal attack damage: " + normalAttack
				+ "\nPokemon special attack damage: " + specialAttack
				+ "\nPokemon defence negating value: " + defence
				+ "\nPokemon experience: " + p.getCurrentXP() + " / " + xpToEvolve);
		
	}

}
