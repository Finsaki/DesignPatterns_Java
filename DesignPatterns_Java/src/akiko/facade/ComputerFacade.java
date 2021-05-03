package akiko.facade;

public class ComputerFacade {
	
	private CPU cpu = new CPU();
	private Memory memory = new Memory();
	private HardDrive hardDrive = new HardDrive();
	
	private static long kBootAddress = 0;
	private static int kBootSector = 0;
	private static int kSectorSize = 1;
	
	public void start() {
		cpu.freeze();
		memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
		cpu.jump(kBootAddress);
		cpu.execute();
	}

}
