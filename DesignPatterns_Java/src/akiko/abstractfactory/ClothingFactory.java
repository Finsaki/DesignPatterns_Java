package akiko.abstractfactory;

/**
 * Interface for different kind of clothing factories
 * @author Aki Koppinen
 */
public interface ClothingFactory {
	
	public abstract Pants createPants();
	public abstract Shirt createShirt();
	public abstract Hat createHat();
	public abstract Shoes createShoes();

}
