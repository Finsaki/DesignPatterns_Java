package akiko.builder;

import akiko.builder.burgerbuilder.IBurgerBuilder;
import akiko.builder.director.Chef;
import akiko.builder.hesburger.HesburgerBurger;
import akiko.builder.hesburger.HesburgerBurgerBuilder;

/**
 * Classes are mostly copied from teachers materials with tiny tweaks.
 * 
 * This is the customer class which chooses what builder to use. In this case it uses the HesburgerBurgerBuilder.
 * @author Aki Koppinen (1810088), ope
 * @version 1.0 19.04.2021
 * 
 */
public class HesburgerCustomer {

	public static void main(String[] args) {
		
		Chef chef = new Chef();
		IBurgerBuilder burgerBuilder = new HesburgerBurgerBuilder();
		chef.setBurgerBuilder(burgerBuilder);
		chef.constructBurger();
		
		HesburgerBurger burger = (HesburgerBurger)burgerBuilder.getBurger();
		System.out.println("Here is your burger which has " + burger + " in it.");
	}

}
