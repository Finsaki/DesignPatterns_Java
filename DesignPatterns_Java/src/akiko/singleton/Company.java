package akiko.singleton;

/**
 * This class is a singleton class which keeps track of the total working hours accumulated inside the company
 * Could be further implemented to store real time data of other stuff as well and not just the working time
 * @author akiko
 *
 */
public class Company {
	
	private double totalWorkTime;
	private static Company instance;
	
	private Company() {
		setTotalWorkTime(0);
	}
	
	public static Company getInstance(){
		if (instance == null){
			instance = new Company();	
		}
		return instance;
	}

	public double getTotalWorkTime() {
		return totalWorkTime;
	}

	public void setTotalWorkTime(double totalWorkTime) {
		this.totalWorkTime = totalWorkTime;
	}

}
