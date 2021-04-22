package akiko.builder.mcdonalds;

import akiko.builder.burgerbuilder.IBurgerBuilder;

/**
 * This is a concrete builder class creating a McDonaldsBurger
 * @author akiko
 *
 */
public class McDonaldsVeganBurgerBuilder implements IBurgerBuilder{
	
	private McDonaldsBurger vurger;

	@Override
	public void createNewBurgerProduct() {
		vurger = new McDonaldsBurger();
	}

	@Override
	public void buildBun() {
		vurger.setBun(new Bun("wheat bun"));
	}

	@Override
	public void buildPatty() {
		vurger.setPatty(new Patty("soy patty"));
	}

	@Override
	public void buildLettuce() {
		vurger.setLettuce(new Lettuce("iceberg lettuce"));
	}

	@Override
	public void buildSauce() {
		vurger.setSauce(new Sauce("McFeast sauce"));
	}

	@Override
	public void buildTopping() {
		vurger.setTopping(new Topping("sesami seeds"));
	}

	@Override
	public Object getBurger() {
		return vurger;
	}
	

}
