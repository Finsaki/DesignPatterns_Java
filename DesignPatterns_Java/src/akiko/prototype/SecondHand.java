package akiko.prototype;

/**
 * Needs only a shallow copy as int is immutable
 * @author akiko
 *
 */
public class SecondHand implements IHand, Cloneable {
	
	private int seconds;
	
	public SecondHand() {
		this.seconds = 0;
	}

	@Override
	public int getTime() {
		return seconds;
	}

	@Override
	public void setTime(int secondsNow) {
		this.seconds = secondsNow;
	}
	
	@Override
	public Object clone() {
	    try {
	        return (SecondHand)super.clone();
	    } catch (CloneNotSupportedException e) {
	    	e.printStackTrace();
	        //return new SecondHand();
	    }
	    return null;
	}
}
