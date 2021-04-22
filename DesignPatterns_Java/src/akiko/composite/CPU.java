package akiko.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Central processing unit (Prosessori)
 * @author akiko
 *
 */
public class CPU implements Component {
	
	private double cost;
	private List<Component> cpuComponents = new ArrayList<Component>();
	
	public CPU(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Central Processing Unit";
	}

	@Override
	public void addComponent(Component component) { //only Cooling can be added to processor... so can/could this be Cooling parameter?
		cpuComponents.add(component);
	}

	@Override
	public double getCost() {
		double totalCost = this.cost;
		for (Component c: cpuComponents) {
			totalCost += c.getCost();
		}
		return totalCost;
	}

}
