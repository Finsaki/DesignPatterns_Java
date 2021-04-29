package akiko.iterator;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * This is a iterator test program which showcases the different things a iterator can manage
 * Things tried: Running multiple iterators, adding items while iterating and deleting items while iterating
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 26.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> jcapiTreeSet = new TreeSet<>();
		IterableTree iterTree = new IterableTree(jcapiTreeSet);
		
		inputToContinue(scan);
		iterTree.fillTreeSet(20);
		inputToContinue(scan);
		new Thread(iterTree).start();
		//inputToContinue(scan); //enable/disable
		//new Thread(iterTree).start(); //enable to have a seconds thread
		inputToContinue(scan);
		System.out.println("Program finished, bye bye");

	}

	private static void inputToContinue(Scanner scan) {
		System.out.println("Input something to continue");
		scan.nextLine();
	}
	
}
