package akiko.strategy;

import java.util.Iterator;
import java.util.List;

/**
 * This Singleton class inserts a space after every object in the given list
 * Using Iterator to iterate through the list objects
 * @author akiko
 *
 */
public class AfterFirst implements ListConverter {
	
	private static AfterFirst instance;
	
	private AfterFirst() {};
	
	public static synchronized AfterFirst  getInstance(){
		if (instance == null){
			instance = new AfterFirst();
		}
		return instance;
	}

	@Override
	public String listToString(List<Object> list) {
		StringBuilder strings = new StringBuilder();
		Iterator<Object> iteratorList = list.iterator();
		while (iteratorList.hasNext()) {
			strings.append(iteratorList.next().toString()+ " ") ;
		}
		return strings.toString();
	}

}
