package akiko.strategy;

import java.util.List;

/**
 * This is the strategy interface which is implemented by different concrete strategies.
 * These concrete strategies can be accessed through this interface.
 * @author akiko
 *
 */
public interface ListConverter {
	
	public String listToString(List<Object> list);

}
