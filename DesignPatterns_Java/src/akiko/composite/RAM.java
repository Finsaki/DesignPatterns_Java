package akiko.composite;

/**
 * Random Access Memory (Keskusmuisti)
 * @author akiko
 *
 */
public class RAM implements Component {
	
	private double cost;
	
	public RAM(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Random Access Memory";
	}

	@Override
	public void addComponent(Component component) {
		throw new RuntimeException ("Cannot add a component to a leaf component ...");
	}

	@Override
	public double getCost() {
		return this.cost;
	}
	
}
