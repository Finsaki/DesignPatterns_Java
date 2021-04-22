package akiko.visitor.stateclasses;

import akiko.visitor.visitorclasses.FatigueVisitor;
import akiko.visitor.visitorclasses.HungerVisitor;
import akiko.visitor.visitorclasses.Visitor;

/**
 * Context
 * @author akiko
 *
 */
public class Coder {
	
	private CoderState state;
	private Visitor fVisitor;
	private Visitor hVisitor;
	private int fatigue;
	private int hunger;
	
	public Coder() {
		setState(Coding.getInstance());
		fVisitor = new FatigueVisitor();
		hVisitor = new HungerVisitor();
	}
	
	public void doStuff() {
		state.doStuff(this);
		hVisitor.visitCoder(this);
		fVisitor.visitCoder(this);
	}

	public CoderState getState() {
		return state;
	}

	public void setState(CoderState state) {
		this.state = state;
	}

	public int getFatigue() {
		return fatigue;
	}

	public void setFatigue(int fatigue) {
		this.fatigue = fatigue;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

}
