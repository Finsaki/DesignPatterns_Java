package akiko.factorymethod;

/**
 * 
 * @author Aki Koppinen, 1810088
 * 18.03.2021
 */
public class Tyoton extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Kalja();
	}

}
