package akiko.adapter;

import akiko.adapter.special.*;

/**
 * Adapter chooses the Advanced alert based on the severity it gets on the constructor
 * @author akiko
 *
 */
public class AlertAdapter implements IAlert{
	
	private IAdvancedAlert aAlert;
	
	public AlertAdapter(int severity) {
		if (severity == 2) {
			aAlert = new SpecialAlert();
		} else if (severity == 3) {
			aAlert = new SuperAlert();
		}
	}

	@Override
	public void playAlert(int severity, int count) {
		aAlert.playAdvancedAlert(count);
	}

	public IAdvancedAlert getaAlert() {
		return aAlert;
	}

}
