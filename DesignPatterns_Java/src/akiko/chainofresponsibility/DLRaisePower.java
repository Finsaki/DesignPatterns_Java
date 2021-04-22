package akiko.chainofresponsibility;

/**
 * Department leader raise handling power
 * @author akiko
 *
 */
public class DLRaisePower extends RaisePower {
	
	private final double ALLOWED = 1.05;
	
	public void processRequest(RaiseRequest request) {
		if (request.getAmount() < request.getEmployee().getSalary() * ALLOWED) {
			request.getEmployee().setSalary(request.getAmount());
			System.out.println("Department Leader has approved your raise");
		} else {
			System.out.println("Your raise is too big for Department Leader to approve, transfering request to next level");
			super.processRequest(request);
		}
	}

}
