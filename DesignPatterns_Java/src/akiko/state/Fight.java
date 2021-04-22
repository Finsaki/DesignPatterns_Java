package akiko.state;

import java.util.Random;

/**
 * BATTLE!
 * 
 * Normal attack and special attack will both deal damage. Using defence will block incoming damage by the defence value.
 * @author akiko
 *
 */
public class Fight {
	
	private Pokemon pokemon;
	private Random r;
	private int opponentHP;
	private int opponentSpeed;
	private int experience;
	
	public Fight(Pokemon pokemon) {
		this.pokemon = pokemon;
		r = new Random();
	}
	
	public void startFight() {
		opponentHP = r.nextInt(95) + 5;
		opponentSpeed = r.nextInt(95) + 5;
		experience = r.nextInt(25) + 5;
		int round = 1;
		
		System.out.println("Battle begins, your opponent has " + opponentHP + " hitpoints and its speed is " + opponentSpeed);
		
		while (pokemon.getCurrentHP() > 0 && opponentHP > 0) {
			
			System.out.println("\nRound " + round);
			
			boolean playerGoesFirst = compareSpeeds(pokemon.getCurrentSpeed(), opponentSpeed);
			compareResults(makeRandomMoveForPlayer(), makeRandomMoveForOpponent(), playerGoesFirst);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			round ++;
			experience += 2; //increasing the experience gained the longer the fight is
		}
		
		if (pokemon.getCurrentHP() <= 0) {
			System.out.println("Remember to rest your pokemon!");
		} else {
			pokemon.win(experience);
		}
	}
	
	private int makeRandomMoveForPlayer() {
		int hpChange;
		int move = r.nextInt(3);
		if (move == 1) {
			hpChange = pokemon.normalAttack();
		} else if (move == 2) {
			hpChange = pokemon.specialAttack();
		} else {
			hpChange = -pokemon.defend(); //defence is made different by giving it a minus value
		}
		return hpChange; //the chosen action
	}
	
	private int makeRandomMoveForOpponent() {
		int hpChange;
		int move = r.nextInt(3);
		if (move == 1) {
			hpChange = r.nextInt(70) + 5; //opponents basic attack
		} else if (move == 2) {
			hpChange = r.nextInt(110) + 5; //opponents special attack
		} else {
			hpChange = -(r.nextInt(75) + 5); //opponents defence value
		}
		return hpChange; //the chosen action
	}
	
	private boolean compareSpeeds(int playerSpeed, int opponentSpeed) {
		if (playerSpeed >= opponentSpeed) {
			System.out.println("Your pokemon is faster and will go first");
			return true;
		} else {
			System.out.println("Your opponent is faster and will go first");
			return false;
		}
		
	}
	
	private void compareResults(int player, int opponent, boolean playerFirst) {
		if (player < 0 && opponent < 0) {
			bothUseDefence();
		} else if (player < 0) {
			onlyPlayerUsesDefence(player, opponent); //I suppose which one goes first does not matter when another one uses defence
		} else if (opponent < 0) {
			onlyOpponentUsesDefence(player, opponent);
		} else {
			if (playerFirst) {
				if (playerDoesDamage(player)) { //return true if opponent is still alive
					opponentDoesDamage(opponent);
				}
			} else {
				if (opponentDoesDamage(opponent)) { //return true if player is still alive
					playerDoesDamage(player);
				}
			}
			
		}
		
	}
	
	private void bothUseDefence() {
		System.out.println("Both pokemons defend, nothing happens");
	}
	
	private void onlyPlayerUsesDefence(int player, int opponent) {
		System.out.println("Your opponent deals " +  opponent + " damage.");
		System.out.println("Your pokemon blocks for " +  player + " damage.");
		
		if (opponent + player > 0) {
			System.out.println("Your pokemon uses defence to block part of the attack and takes" + (opponent + player) + " damage");
			pokemon.takeDamage(opponent + player);
		} else {
			System.out.println("Your pokemon blocks the attack and takes no damage");
		}
	}
	
	private void onlyOpponentUsesDefence(int player, int opponent) {
		System.out.println("Your pokemon deals " +  player + " damage.");
		System.out.println("Your opponent blocks for " +  opponent + " damage.");
		
		if (opponent + player > 0) {
			System.out.println("Your attack goes through the opponents defences and does " + (opponent + player) + " damage");
			opponentHP -= (opponent + player);
			if (opponentHP <= 0) {
				System.out.println("Your opponent fainted");
			} else {
				System.out.println("Your opponent has " + opponentHP + " hitpoints left");
			}
		} else {
			System.out.println("Your opponent blocks the attack and takes no damage");
		}
	}
	
	private boolean playerDoesDamage(int player) {
		System.out.println("Your pokemon deals " +  player + " damage.");
		
		opponentHP -= player;
		System.out.println("Your opponent takes " + player + " damage");
		if (opponentHP <= 0) {
			System.out.println("Your opponent fainted");
			return false;
		} else {
			System.out.println("Your opponent has " + opponentHP + " hitpoints left");
			return true;
		}
	}
	
	private boolean opponentDoesDamage(int opponent) {
		System.out.println("Your opponent deals " +  opponent + " damage.");
		
		pokemon.takeDamage(opponent);
		if (pokemon.getCurrentHP() <= 0) {
			return false;
		} else {
			return true;
		}
	}

}
