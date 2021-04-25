package akiko.prototype;

/**
 * Cloneable class, needs to implement a deep copy to also clone IHand class variables
 * @author akiko
 *
 */
public class Clock implements IClock, Cloneable {
	
	private IHand hours;
	private IHand minutes;
	private IHand seconds;
	
	public Clock() {
		this.hours = new HourHand();
		this.minutes = new MinuteHand();
		this.seconds = new SecondHand();
	}
	
	public void tick() {
		seconds.setTime(seconds.getTime() + 1);
		if (seconds.getTime() > 59) {
			seconds.setTime(0);
			minutes.setTime(minutes.getTime() + 1);
			if (minutes.getTime() > 59) {
				minutes.setTime(0);
				hours.setTime(hours.getTime() + 1);
				if (hours.getTime() > 23) {
					hours.setTime(0);
				}
			}
		}
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.hours.setTime(hours);
		this.minutes.setTime(minutes);
		this.seconds.setTime(seconds);	
	}
	
	public int getHours() {
		return hours.getTime();
	}
	
	public int getMinutes() {
		return minutes.getTime();
	}
	
	public int getSeconds() {
		return seconds.getTime();
	}
	
	public String toString() {
		return addZero(hours.getTime()) + ":" + addZero(minutes.getTime()) + ":" + addZero(seconds.getTime());
	}
	
	private String addZero(int num) {
		if (num > 9) {
			return String.valueOf(num);
		} else {
			return "0" + num;
		}
	}
	
	@Override
	public Object clone() {
		Clock c = null;
		try {
			c = (Clock)super.clone();
			c.hours = (IHand)hours.clone();
			c.minutes = (IHand)minutes.clone();
			c.seconds = (IHand)seconds.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;
	}

}
