package akiko.composite;

/**
 * Fans or other cooling (in Case and CPU)
 * @author akiko
 *
 */
public class Cooling implements Component {
	
	private double cost;
	
	public Cooling(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Memory storage";
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
