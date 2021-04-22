package akiko.observer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private LocalTime time;

	@Override
	public void run() {
		while (true) {
			String response = getCurrentTime();
			setChanged();
			notifyObservers(response);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private String getCurrentTime() {
		time = LocalTime.now();
		return time.format(formatter);
	}

}
