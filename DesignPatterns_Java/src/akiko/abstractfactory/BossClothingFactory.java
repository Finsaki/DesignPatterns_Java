package akiko.abstractfactory;

/**
 * Clothing factory responsible for creating Boss clothing
 * @author Aki Koppinen
 */
public class BossClothingFactory implements ClothingFactory {

	@Override
	public Pants createPants() {
		return new BossJeans();
	}

	@Override
	public Shirt createShirt() {
		return new BossTShirt();
	}

	@Override
	public Hat createHat() {
		return new BossCap();
	}

	@Override
	public Shoes createShoes() {
		return new BossShoes();
	}

}
