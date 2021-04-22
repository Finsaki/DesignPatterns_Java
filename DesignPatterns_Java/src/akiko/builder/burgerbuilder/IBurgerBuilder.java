package akiko.builder.burgerbuilder;

/**
 * This is the builder interface
 * @author akiko
 *
 */
public interface IBurgerBuilder {
	
	public abstract void createNewBurgerProduct();
	public abstract void buildBun();
	public abstract void buildPatty();
	public abstract void buildLettuce();
	public abstract void buildSauce();
	public abstract void buildTopping();
  
	public abstract Object getBurger(); 

}
