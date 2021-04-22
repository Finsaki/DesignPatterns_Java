package akiko.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User can add items to a list and convert them using different strategies.
 * 
 * These strategies are implementing the ListConverter interface, 
 * and will return String representation of the list but each will add spaces differently between objects.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 08.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Object> list = new ArrayList<>(); //list can hold any Objects but strategy classes will call their toString methods so that a string is returned.
		ListConverter listCon = null;
		
		String input = "";
		//Asking user if they want to add more items into list, show list contents, convert using different strategies or exit program
		while (!input.equals("4")) {
			System.out.println("\n-----\nInput 1 to add an object to your list\nInput 2 to print the contents of your list"
					+ "\nInput 3 to choose your list converter\nInput 4 to exit program\n-----\n");
			input = scan.nextLine();
			if (input.equals("1")) {
				addToList(scan, list);
			}
			if (input.equals("2")) {
				printListItems(list);
			}
			if (input.equals("3")) {
				chooseListConverter(scan, list, listCon);
			}
		}
		
		scan.close();

	}
	
	/**
	 * Add an item into the list
	 * @param scan Scanner
	 * @param list List
	 */
	private static void addToList(Scanner scan, List<Object> list) {
		System.out.println("Please write your list item here");
		String input2 = scan.nextLine();
		if (input2.isEmpty()) {
			System.out.println("Empty inputs are not accepted");
		} else {
			list.add(input2);
		}
	}
	
	/**
	 * Normally print the contents of the list
	 * @param list List
	 */
	private static void printListItems(List<Object> list) {
		if (checkIfEmpty(list)) {
			for (Object obj: list) {
				System.out.println(obj.toString());
			}
		}
	}
	
	/**
	 * Choose a strategy on how to print the list items in special ways
	 * @param scan Scanner
	 * @param list List
	 * @param listCon ListConverter
	 */
	private static void chooseListConverter(Scanner scan, List<Object> list, ListConverter listCon) {
		if (checkIfEmpty(list)) {
			System.out.println("Converters add spaces between your list objects in different ways and then print out the result");
			String input2 = "";
			String result = "";
			
			while (!input2.equals("4")) {
				System.out.println("\n-----\nInput 1 to add spaces after every object\nInput 2 to add spaces after every two objects"
						+ "\nInput 3 to add spaces after every three objects\nInput 4 to return to menu\n-----\n");
				input2 = scan.nextLine();
				
				if (input2.equals("1")) {
					listCon = AfterFirst.getInstance();
					result = listCon.listToString(list);
					System.out.println(result);
				}
				if (input2.equals("2")) {
					listCon = AfterSecond.getInstance();
					result = listCon.listToString(list);
					System.out.println(result);
				}
				if (input2.equals("3")) {
					listCon = AfterThird.getInstance();
					result = listCon.listToString(list);
					System.out.println(result);
				}
			}
		}
	}
	
	/**
	 * This tells if the list being checked is empty, it then informs the user if it was and returns false
	 * @param list List
	 * @return value false if empty, true if not empty
	 */
	private static boolean checkIfEmpty(List<Object> list) {
		if (list.isEmpty()) {
			System.out.println("List has no objects");
			return false;
		} else {
			return true;
		}
	}

}
