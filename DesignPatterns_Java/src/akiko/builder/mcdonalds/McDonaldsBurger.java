package akiko.builder.mcdonalds;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a concrete product class.
 * 
 * Data structure as a List
 * @author akiko
 *
 */
public class McDonaldsBurger {
	
	private List<Object> ingredients = new ArrayList<>();
	
	public void setBun(Bun bun) {
		ingredients.add(bun);
	}

	public void setPatty(Patty patty) {
		ingredients.add(patty);
	}

	public void setLettuce(Lettuce lettuce) {
		ingredients.add(lettuce);
	}

	public void setSauce(Sauce sauce) {
		ingredients.add(sauce);
	}

	public void setTopping(Topping topping) {
		ingredients.add(topping);
	}
	
	public List<Object> getIngredients() {
		return ingredients;
	}

}
