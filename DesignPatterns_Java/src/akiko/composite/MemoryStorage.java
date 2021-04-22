package akiko.composite;

/**
 * For example HDD or SSD
 * @author akiko
 *
 */
public class MemoryStorage implements Component {
	
	private double cost;
	
	public MemoryStorage(double cost) {
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
