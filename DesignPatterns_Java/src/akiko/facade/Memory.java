package akiko.facade;

public class Memory {

	public void load(long position, byte[] data) {
		System.out.println("Loaded " + data + " at position " + position);
	}

}
