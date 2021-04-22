package akiko.chainofresponsibility;

/**
 * Basic employee object where to store name and salary information
 * @author akiko
 *
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String fn, String ln, double salary) {
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setSalary(salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName + " earns " + this.salary + "€.";
	}

}
