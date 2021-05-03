package akiko.facade;

public class CPU {

	public void freeze() {
		System.out.println("Freezing the other processes");
	}

	public void jump(long position) {
		System.out.println("Jumping to position " + position);

	}

	public void execute() {
		System.out.println("Executing...");

	}

}
