package akiko.prototype;

/**
 * Needs only a shallow copy as int is immutable
 * @author akiko
 *
 */
public class MinuteHand implements IHand, Cloneable {
	
	private int minutes;
	
	public MinuteHand() {
		this.minutes = 0;
	}

	@Override
	public int getTime() {
		return minutes;
	}

	@Override
	public void setTime(int minutesNow) {
		this.minutes = minutesNow;
	}
	
	@Override
	public Object clone() {
	    try {
	        return (MinuteHand)super.clone();
	    } catch (CloneNotSupportedException e) {
	    	e.printStackTrace();
	        //return new MinuteHand();
	    }
	    return null;
	}

}
