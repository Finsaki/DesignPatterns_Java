package akiko.composite;

/**
 * Network interface controller (Verkkokortti)
 * @author akiko
 *
 */
public class NIC implements Component {
	
	private double cost;
	
	public NIC(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Network interface controller";
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
