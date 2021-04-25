package akiko.prototype;

/**
 * This is an exercise to showcase the prototype design pattern
 * The main class creates three clocks and one of them it clones using overriden clone() function.
 * Tests are run in main class to see how the clocks and cloned clocks behave and if their variables still match or not
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 25.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Putting 3 clocks to run.\n");
		
		System.out.println("Creating a new unique clock");
		IClock clock1 = new Clock();
		runClock(clock1, 50);
		
		System.out.println("Creating a clone of clock 1");
		IClock clock2 = (IClock)clock1.clone(); //Cloning just the interface, does not need to see implementation
		runClock(clock2, 25);
		
		System.out.println("Creating a new unique clock");
		IClock clock3 = new Clock();
		runClock(clock3, 25);
		
		System.out.println("Clock 1 (original) now: " + clock1);
		System.out.println("Clock 2 (clone of original) now: " + clock2);
		System.out.println("Clock 3 (not cloned) now: " + clock3);
		
		System.out.println("\nChecking if clock2 is a deep copy of clock1");
		System.out.println(testIfDeepCopy(clock1, clock2));
		System.out.println("Checking if clock3 is a deep copy of clock1");
		System.out.println(testIfDeepCopy(clock1, clock3));

		System.out.println("\nSetting a new time of 20:42:05 for original clock");
		clock1.setTime(20, 42, 5);
		System.out.println("\nCloning clock 3 into clock1\n");
		clock3 = (IClock)clock1.clone(); //Cloning just the interface, does not need to see implementation
		
		System.out.println("Clock 1 (original) now: " + clock1);
		System.out.println("Clock 2 (previous clone of original) now: " + clock2);
		System.out.println("Clock 3 (new clone of original) now: " + clock3);
		
		System.out.println("\nChecking if clock2 is a deep copy of clock1");
		System.out.println(testIfDeepCopy(clock1, clock2));
		System.out.println("Checking if clock3 is a deep copy of clock1");
		System.out.println(testIfDeepCopy(clock1, clock3) + "\n");

	}
	
	private static void runClock(IClock clock, int seconds) {
		int i = 0;
		System.out.println("Clock runs for " + seconds + " seconds");
		while (i < seconds) {
			System.out.println(clock);
			clock.tick();
			i++;
		}
		System.out.println("Clock has finished\n");
	}
	
	private static boolean testIfDeepCopy(IClock clockA, IClock clockB) {
		if (clockA.getHours() == clockB.getHours() && clockA.getMinutes() == clockB.getMinutes() && clockA.getSeconds() == clockB.getSeconds()) {
			return true;
		} else {
			return false;
		}
	}

}
