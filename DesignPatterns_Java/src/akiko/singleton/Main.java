package akiko.singleton;

/**
 * This class is used to test the singleton functionality of the Company class.
 * The singleton makes sure there is only one instance of the given company and updates the total working hours when workers work.
 * @author Aki Koppinen, 1810088
 * @version 1.0 28.03.2021
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker jane = new Worker(1, "Jane", "Goodwin", "CEO");
		Worker matt = new Worker(2, "Matt", "Bloomberg", "CTO");
		Worker brad = new Worker(3, "Brad", "Broodsburg", "Java-Programmer");
		work(jane, 5.5);
		work(matt, 6.5);
		work(brad, 10.0);
		work(jane, 2.0);
		work(brad, 12.0);
	}
	
	//here we use the singleton by getting a new instance of it
	private static void work(Worker worker, double time) {
		worker.setWorktime(worker.getWorktime() + time);
		Company company = Company.getInstance();
		company.setTotalWorkTime(company.getTotalWorkTime() + time);
		printWorkTime(worker, company);
	}
	
	//here we try the singleton by bringin it as a parameter
	private static void printWorkTime(Worker worker, Company company) {
		System.out.println(worker.getPosition() + " " + worker.getFirstName() + " " + worker.getLastName() + " has worked a total of " + worker.getWorktime() + " hours.");
		System.out.println("Companys total working time is " + company.getTotalWorkTime() + " hours");
	}

}
