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
public class FatigueVisitor implements Visitor {

	@Override
	public void visitCoder(Coder coder) {
		if (coder.getState() != Eating.getInstance()) {
			if (coder.getFatigue() > 15) {
				System.out.println("\nCoder is tired, going to sleep\n");
				coder.setState(Sleeping.getInstance());
			} else if (coder.getFatigue() < 1) {
				System.out.println("\nCoder is rested, returning to code\n");
				coder.setState(Coding.getInstance());
			}
		}
		
	}

}
