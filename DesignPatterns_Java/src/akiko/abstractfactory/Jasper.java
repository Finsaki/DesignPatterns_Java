package akiko.abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class dresses Jasper based on the chosen ClothingFactory implementation
 * @author Aki Koppinen, 1810088
 * @version 1.0 23.03.2021
 */
@SuppressWarnings("unused")
public class Jasper {
	
	private static Pants pants;
	private static Shirt shirt;
	private static Hat hat;
	private static Shoes shoes;

	//@SuppressWarnings("unchecked") //check for reflection API method
	public static void main(String[] args) {
		//Non Reflection API method
		dressJasper(new AdidasClothingFactory()); //change Clothing factory parameter as needed
		
		/*
		//Reflection API method
		@SuppressWarnings("rawtypes")
		Class c = null; //no type as using properties later
		ClothingFactory factory = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/akiko/abstractfactory/factory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("factory")); //Change "adidasfactory" or "bossfactory" in factory.properties file by commenting out the one not in use
			factory = (ClothingFactory)c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dressJasper(factory);
		*/
		
		//Printing the current clothing
		printCurrentOutfit();
	}
	
	/**
	 * Setting clothing for Jasper based on the chosen clothing factory
	 * @param factory this decides which pants, shirt, hat and shoes Jasper will wear
	 */
	private static void dressJasper(ClothingFactory factory) {
		pants = factory.createPants();
		shirt = factory.createShirt();
		hat = factory.createHat();
		shoes = factory.createShoes();
	}
	
	/**
	 * A method to print the current outfit based on the static variables for different pieces of clothing
	 */
	private static void printCurrentOutfit() {
		System.out.println("Jasper is now wearing:\n" + pants + "\n" + shirt + "\n" + hat + "\n" + shoes);
	}

}
