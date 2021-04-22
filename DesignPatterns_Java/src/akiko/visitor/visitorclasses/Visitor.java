package akiko.visitor.visitorclasses;

import akiko.visitor.stateclasses.Coder;

/**
 * Visitor
 * @author akiko
 *
 */
public interface Visitor {
	
	void visitCoder(Coder coder);
	
}
