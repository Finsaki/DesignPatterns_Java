package akiko.strategy;

import java.util.List;

/**
 * This Singleton class inserts a space after every second object in the given list
 * Using for loop to iterate through the list objects, after turning the list first into an array
 * @author akiko
 *
 */
public class AfterSecond implements ListConverter {
	
	private static AfterSecond instance;
	
	private AfterSecond() {};
	
	public static synchronized AfterSecond  getInstance(){
		if (instance == null){
			instance = new AfterSecond();
		}
		return instance;
	}

	@Override
	public String listToString(List<Object> list) {
		StringBuilder strings = new StringBuilder();
		Object[] array = list.toArray();
		int counter = 1;
		for (Object obj: array) {
			strings.append(obj.toString());
			if (counter % 2 == 0) {
				strings.append(" ");
			}
			counter ++;
		}
		return strings.toString();
	}

}
