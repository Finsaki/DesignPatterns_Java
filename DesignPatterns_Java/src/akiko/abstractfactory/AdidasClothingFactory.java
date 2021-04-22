package akiko.abstractfactory;

/**
 * Clothing factory responsible for creating Adidas clothing
 * @author Aki Koppinen
 */
public class AdidasClothingFactory implements ClothingFactory{

	@Override
	public Pants createPants() {
		return new AdidasJeans();
	}

	@Override
	public Shirt createShirt() {
		return new AdidasTShirt();
	}

	@Override
	public Hat createHat() {
		return new AdidasCap();
	}

	@Override
	public Shoes createShoes() {
		return new AdidasShoes();
	}

}
