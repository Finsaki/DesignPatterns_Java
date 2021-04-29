package akiko.iterator;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Test class for iterator
 * Houses int values in a TreeSet
 * 
 * @author akiko
 *
 */
public class IterableTree implements Runnable {
	
	private TreeSet<Integer> jcapiTreeSet;
	private Random rand;
	private Iterator<Integer> itr;

	public IterableTree(TreeSet<Integer> newTreeSet) {
		this.jcapiTreeSet = newTreeSet;
		rand = new Random();
	}
	
	public void fillTreeSet(int amount) {
		System.out.println("\nStarting to fill tree set...");
		for (int i = 0; i < amount; i++) {
			if(!jcapiTreeSet.add(rand.nextInt(1000))) { //if false then value is already in the tree set
				i--; //value already exists, go back in loop by decrementing the i value
			}
		}
		itr = this.jcapiTreeSet.iterator(); //enable for shared iterator
		System.out.println("...Tree set is now filled with " + amount + " random and distinct values\n");
	}

	@Override
	public void run() {
		//Iterator<Integer> itr = this.jcapiTreeSet.iterator(); //enable for different iterators for each thread
		System.out.println("Starting to print values in tree set...");
		long start = System.nanoTime();
		if (!jcapiTreeSet.isEmpty()) { //if fillTreeSet is not used
			
			while (itr.hasNext()) {
				
				int mayby = rand.nextInt(3);
				if (mayby == 2) {
					//jcapiTreeSet.add(1 + rand.nextInt(10)); //adding while iterating gives error
					System.out.println("Number to be removed: " + itr.next());
					itr.remove(); //removal works, is one of the benefits of an iterator
				}
				
				System.out.println(itr.next());
			}
			
		}
		long finish = System.nanoTime();
		long timeElapsed = finish - start; //counting the time used for tests
		System.out.println("...Printing tree set values has finished, time spent was: " + timeElapsed + " nanoseconds\n");
	}
	
	

}
