package akiko.builder.hesburger;

/**
 * This is a concrete product class.
 * 
 * Data structure as a StringBuilder
 * @author akiko
 *
 */
public class HesburgerBurger {
	
	private StringBuilder ingredients = new StringBuilder();
	
	public void setBun(String bun) {
		ingredients.append(bun + ", ");
	}
	
	public void setPatty(String patty) {
		ingredients.append(patty + ", ");
	}

	public void setLettuce(String lettuce) {
		ingredients.append(lettuce + ", ");
	}

	public void setSauce(String sauce) {
		ingredients.append(sauce + ", ");
	}

	public void setTopping(String topping) {
		ingredients.append("and " + topping);
	}

	public String toString() {
		return ingredients.toString();
	}


}
