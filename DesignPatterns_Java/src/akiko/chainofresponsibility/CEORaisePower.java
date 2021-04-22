package akiko.chainofresponsibility;

import java.util.Random;

/**
 * Chief executive officer raise handling power.
 * This ceo will approve anything with 1/4 chance.
 * @author akiko
 *
 */
public class CEORaisePower extends RaisePower {
	
	private final Random rand = new Random();
	
	public void processRequest(RaiseRequest request) {
		if (rand.nextInt(4) == 3) {
			request.getEmployee().setSalary(request.getAmount());
			System.out.println("CEO has approved your raise");
		} else {
			System.out.println("CEO has denied your raise, better luck next time");
		}
	}

}
