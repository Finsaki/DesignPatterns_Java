package akiko.chainofresponsibility;

/**
 * Project manager raise handling power
 * @author akiko
 *
 */
public class PMRaisePower extends RaisePower {
	
	private final double ALLOWED = 1.02;
	
	public void processRequest(RaiseRequest request) {
		if (request.getAmount() < request.getEmployee().getSalary() * ALLOWED) {
			request.getEmployee().setSalary(request.getAmount());
			System.out.println("Project Manager has approved your raise");
		} else {
			System.out.println("Your raise is too big for Project Manager to approve, transfering request to next level");
			super.processRequest(request);
		}
	}

}
