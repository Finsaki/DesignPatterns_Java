package akiko.composite;

/**
 * Power Supply Unit
 * @author akiko
 *
 */
public class PSU implements Component {
	
	private double cost;
	
	public PSU(double cost) {
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
