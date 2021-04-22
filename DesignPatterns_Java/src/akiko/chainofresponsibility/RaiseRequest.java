package akiko.chainofresponsibility;
/**
 * 
 * @author ope (copy, with small changes), akikop
 *
 */
public class RaiseRequest {
	
	private double amount;
	private Employee employee;
	
	public RaiseRequest(double amount, Employee employee) {
		this.setAmount(amount);
		this.setEmployee(employee);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
