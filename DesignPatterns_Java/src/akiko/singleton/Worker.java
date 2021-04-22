package akiko.singleton;

/**
 * This is a normal object class which creates a worker with given id, name and position in the company.
 * @author akiko
 *
 */
public class Worker {
	
	private int workerId;
	private String firstName;
	private String lastName;
	private String position;
	private double worktime;
	
	public Worker(int id, String fn, String ln, String pos) {
		this.workerId = id;
		this.firstName = fn;
		this.lastName = ln;
		this.position = pos;
		this.worktime = 0.00;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getWorktime() {
		return worktime;
	}

	public void setWorktime(double worktime) {
		this.worktime = worktime;
	}

}
