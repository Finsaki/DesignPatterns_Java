package akiko.prototype;

/**
 * Needs only a shallow copy as int is immutable
 * @author akiko
 *
 */
public class HourHand implements IHand, Cloneable {
	
	private int hours;
	
	public HourHand() {
		this.hours = 0;
	}

	@Override
	public int getTime() {
		return hours;
	}

	@Override
	public void setTime(int hoursNow) {
		this.hours = hoursNow;
	}
	
	@Override
	public Object clone() {
	    try {
	        return (HourHand)super.clone();
	    } catch (CloneNotSupportedException e) {
	    	e.printStackTrace();
	        //return new HourHand();
	    }
	    return null;
	}

}
