package akiko.prototype;

/**
 * This is an interface for different hands
 * 
 * And is this actually also a prototype...hmm, so 2 prototypes in this project?
 * @author akiko
 *
 */
public interface IHand {
	
	public int getTime();
	public void setTime(int time);
	public Object clone();

}
