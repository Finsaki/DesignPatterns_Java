package akiko.visitor.visitorclasses;

import akiko.visitor.stateclasses.Coder;
import akiko.visitor.stateclasses.Coding;
import akiko.visitor.stateclasses.Eating;
import akiko.visitor.stateclasses.Sleeping;

/**
 * Concrete visitor
 * @author akiko
 *
 */
public class HungerVisitor implements Visitor {

	@Override
	public void visitCoder(Coder coder) {
		if (coder.getState() != Sleeping.getInstance()) {
			if (coder.getHunger() > 15) {
				System.out.println("\nCoder is hungry, getting something to eat\n");
				coder.setState(Eating.getInstance());
			} else if (coder.getHunger() < 1) {
				System.out.println("\nCoder has finished eating pizza and drinking cola\n");
				coder.setState(Coding.getInstance());
			}
		}
	}

}
