package akiko.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The central electrical component which connects all other electrical components, also houses basic functionality and memory
 * @author akiko
 *
 */
public class Motherboard implements Component {
	
	private double cost;
	private List<Component> mbComponents = new ArrayList<Component>();
	
	public Motherboard(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Motherboard";
	}

	@Override
	public void addComponent(Component component) {
		mbComponents.add(component);
	}

	@Override
	public double getCost() {
		double totalCost = this.cost;
		for (Component c: mbComponents) {
			totalCost += c.getCost();
		}
		return totalCost;
	}

}
