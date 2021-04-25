package akiko.prototype;

/**
 * prototype interface
 * @author akiko
 *
 */
public interface IClock {
	
	public Object clone();
	public void tick();
	public void setTime(int hours, int minutes, int seconds);
	public int getHours();
	public int getMinutes();
	public int getSeconds();

}
