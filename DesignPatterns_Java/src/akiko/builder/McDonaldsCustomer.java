package akiko.builder;

import java.util.List;

import akiko.builder.burgerbuilder.IBurgerBuilder;
import akiko.builder.director.Chef;
import akiko.builder.mcdonalds.McDonaldsBurger;
import akiko.builder.mcdonalds.McDonaldsVeganBurgerBuilder;

/**
 * Classes are mostly copied from teachers materials with tiny tweaks.
 * 
 * This is the customer class which chooses what builder to use. In this case it uses the McDonaldsVeganBurgerBuilder.
 * @author Aki Koppinen (1810088), ope
 * @version 1.0 19.04.2021
 *
 */
public class McDonaldsCustomer {

	public static void main(String[] args) {
	
		Chef chef = new Chef();
		IBurgerBuilder burgerBuilder = new McDonaldsVeganBurgerBuilder();
		chef.setBurgerBuilder(burgerBuilder);
		chef.constructBurger();
		
		McDonaldsBurger burger = (McDonaldsBurger)burgerBuilder.getBurger();
		printIngredientsInList(burger.getIngredients());
	}
	
	private static void printIngredientsInList(List<Object> list) {
		System.out.print("Here is your vurger which has ");
		for (int i = 0; i < list.size(); i++) {
			if (i < list.size() - 1) {
				System.out.print(list.get(i).toString() + ", ");
			} else {
				System.out.print("and " + list.get(i).toString());
			}
		}
		System.out.print(" in it.");
	}

}
