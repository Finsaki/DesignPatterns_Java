package akiko.adapter.special;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Handles alert testing by reading alerts from file and making them uppercase, before printing them out.
 * Prints a bit faster than special alert.
 * 
 * @author akiko
 *
 */
public class SuperAlert implements IAdvancedAlert{
	
	private final String FILENAME = "src/akiko/adapter/messages.txt";

	@Override
	public void playAdvancedAlert(int count) {
		String[] alertsArray = readAlertFromFile(count);
		for (String alert: alertsArray) {
			if (alert == null) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(alert);
		}
	}

	private String[] readAlertFromFile(int count) {
		String[] alerts = new String[count];
		int counter = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				if (counter < count) {
					alerts[counter] = line.toUpperCase();
					counter ++;
				}
			}
			reader.close();
			return alerts;
		} catch (IOException e) {
			System.out.println("Error in reading the file");
			e.printStackTrace();
			return null;
		}
	}

}
