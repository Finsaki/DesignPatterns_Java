package akiko.composite;

/**
 * Graphics Processing Unit (Naytönohjain)
 * @author akiko
 *
 */
public class GPU implements Component {
	
	private double cost;
	
	public GPU(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Graphics Processing Unit";
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
