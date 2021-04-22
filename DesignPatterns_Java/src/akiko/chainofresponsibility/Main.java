package akiko.chainofresponsibility;

import java.util.Scanner;

/**
 * This program showcases the chain of responsibility design pattern.
 * The running of the program changes from one handler class to the next if one cannot process the request.
 * Here the main Handler class is RaisePower and pm, dl and ceo extend it and all try to handle the coming request,
 * starting from pm and ending in ceo.
 * 
 * The actual request being made is a salary raise request. PM will approve raises of up to 2% increase, dl up to 5% increase and
 * ceo will randomly decide to approve or not (1/4 chance to approve).
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 11.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		PMRaisePower pm = new PMRaisePower();
		DLRaisePower dl = new DLRaisePower();
		CEORaisePower ceo = new CEORaisePower();
		pm.setSuccessor(dl);
		dl.setSuccessor(ceo);
		
		Employee pena = new Employee("Pena", "Aarnio", 3000.00); //only one employee for this test
		
		System.out.println("Welcome to salary battle!\n");
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		while (!input.equals("3")) {
			System.out.println("\n-----\nInput 1 to show employee information\nInput 2 to ask for a raise\nInput 3 to exit program\n-----\n");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println(pena);
			}
			if (input.equals("2")) {
				double amount = askForAmount(scan);
				if (amount > pena.getSalary()) { //or (amount > 0) for testing
					pm.processRequest(new RaiseRequest(amount, pena));
				} else {
					System.out.println("Please input an acceptable number\nYour salary request has to be bigger than your current one: " + pena.getSalary() + "€.");
				}
			}
		}
		
		System.out.println("Thanks for the battles!");
		scan.close();

	}
	
	private static double askForAmount(Scanner scan) {
		try {
			System.out.println("Input your desired salary");
			double d = Double.parseDouble(scan.nextLine());
			return d;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}

}
