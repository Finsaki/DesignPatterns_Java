package akiko.state;

/**
 * One thick boi
 * @author akiko
 *
 */
public class Blastoise extends EvolutionState {

	private static Blastoise instance;
	private static final String name = "Blastoise";
	private static final int hitPoints = 79;
	private static final int speed = 78;
	private static final int normalAttack = 83;
	private static final int defence = 100;
	private static final int specialAttack = 85;
	//private static final int xpToEvolve = 239;
	
	private Blastoise() {};
	
	public static synchronized Blastoise getInstance(){
		if (instance == null){
			instance = new Blastoise();	
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
		System.out.println(name + "s current experience is now " + p.getCurrentXP());
		p.setCurrentXP(p.getCurrentXP() + experience);
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
				+ "\nPokemon experience: " + p.getCurrentXP());
		
	}

}
