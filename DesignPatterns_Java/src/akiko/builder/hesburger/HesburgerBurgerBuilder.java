package akiko.builder.hesburger;

import akiko.builder.burgerbuilder.IBurgerBuilder;

/**
 * This is a concrete builder class creating a HesburgerBurger
 * @author akiko
 *
 */
public class HesburgerBurgerBuilder implements IBurgerBuilder{
	
	private HesburgerBurger burger;

	@Override
	public void createNewBurgerProduct() {
		burger = new HesburgerBurger();
	}

	@Override
	public void buildBun() {
		burger.setBun("wheat bun");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("beef patty");
	}

	@Override
	public void buildLettuce() {
		burger.setLettuce("iceberg lettuce");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("BBQ sauce");
	}

	@Override
	public void buildTopping() {
		burger.setTopping("sesami seeds");
	}

	@Override
	public Object getBurger() {
		return burger;
	}

}
