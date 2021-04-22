package akiko.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Case which holds all the components inside it
 * @author akiko
 *
 */
public class Case implements Component {
	
	private double cost;
	private List<Component> caseComponents = new ArrayList<Component>();
	
	public Case(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Case";
	}

	@Override
	public void addComponent(Component component) {
		caseComponents.add(component);
	}

	@Override
	public double getCost() {
		double totalCost = this.cost;
		for (Component c: caseComponents) {
			totalCost += c.getCost();
		}
		return totalCost;
	}

}
