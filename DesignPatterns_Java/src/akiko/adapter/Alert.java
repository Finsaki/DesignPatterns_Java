package akiko.adapter;

/**
 * The normal alert class, transfers control to adapter if it cannot do the job
 * Prints out simple ring ring as alert
 * 
 * @author akiko
 *
 */
public class Alert implements IAlert{
	
	AlertAdapter alertAdapter;

	@Override
	public void playAlert(int severity, int count) {
		if (severity == 1) {
			for(int i = 0; i < count; i++) {
				System.out.println("ring ring");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			alertAdapter = new AlertAdapter(severity);
			if (alertAdapter.getaAlert() != null) {
				alertAdapter.playAlert(severity, count);
			} else {
				System.out.println("Incorrect severity, must be between 1-3");
			}
		}
		

	}

}
