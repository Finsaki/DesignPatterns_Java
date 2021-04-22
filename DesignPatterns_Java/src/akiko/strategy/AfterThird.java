package akiko.strategy;

import java.util.List;

/**
 * This Singleton class inserts a space after every third object in the given list
 * Using for loop to iterate through the list objects. Objects are fetched with the get command from List interface
 * @author akiko
 *
 */
public class AfterThird implements ListConverter {
	
	private static AfterThird instance;
	
	private AfterThird() {};
	
	public static synchronized AfterThird  getInstance(){
		if (instance == null){
			instance = new AfterThird();
		}
		return instance;
	}

	@Override
	public String listToString(List<Object> list) {
		StringBuilder strings = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			strings.append(list.get(i));
			if ((i + 1) % 3 == 0) {
				strings.append(" ");
			}
		}
		return strings.toString();
	}

}
