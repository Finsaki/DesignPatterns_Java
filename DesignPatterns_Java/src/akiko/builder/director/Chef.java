package akiko.builder.director;

import akiko.builder.burgerbuilder.IBurgerBuilder;

/**
 * This is the director class.
 * 
 * @author akiko
 *
 */
public class Chef {
	
	private IBurgerBuilder burgerBuilder;

	public void setBurgerBuilder(IBurgerBuilder bb) {
		burgerBuilder = bb; 
	}
	 
	public void constructBurger() {
		burgerBuilder.createNewBurgerProduct();
		burgerBuilder.buildBun();
		burgerBuilder.buildPatty();
		burgerBuilder.buildLettuce();
		burgerBuilder.buildSauce();
		burgerBuilder.buildTopping();
	}

}