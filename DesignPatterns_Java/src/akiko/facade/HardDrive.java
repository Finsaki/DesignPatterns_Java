package akiko.facade;

public class HardDrive {

	public byte[] read(long lba, int size) {
		System.out.println("Reading at row " + lba + " which has " + size + " characters");
		return new byte[size];
	}

}
