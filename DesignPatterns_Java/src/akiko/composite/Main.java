package akiko.composite;

import java.text.DecimalFormat;

/**
 * To build a pc using composite model
 * 
 * It could be argued that everything that uses electricity is connected to motherboard,
 * but I chose to put motherboard, general cooling and PSU under the chassis to give the assignment more variability.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 27.03.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("####0.00");

		//To build a PC -->
		//Case requirements --> Motherboard, Cooling and PSU
		//Motherboard requirements --> CPU, RAM, NIC, GPU and MemoryStorage
		//CPU requirements --> Cooling
		
		Component chassis = new Case(79.99);
		Component mobo = new Motherboard(179.95);
		Component cool1 = new Cooling(19.99); //general cooling
		Component psu = new PSU(85.00);
		Component cpu = new CPU(389.90);
		Component cool2 = new Cooling(24.90); //cooling for the cpu
		Component ram1 = new RAM(49.99);
		Component ram2 = new RAM(49.99); //many pc's have multiple ram sticks
		Component nic = new NIC(14.50);
		Component gpu = new GPU(669.00); //cryptominers really bringing the prices up
		Component ssd = new MemoryStorage(119.90); //just ssd for this build, hdd is so old school
		
		cpu.addComponent(cool2);
		mobo.addComponent(cpu);
		mobo.addComponent(ram1);
		mobo.addComponent(ram2);
		mobo.addComponent(nic);
		mobo.addComponent(gpu);
		mobo.addComponent(ssd);
		chassis.addComponent(mobo);
		chassis.addComponent(cool1);
		chassis.addComponent(psu);
		
		System.out.println("The total cost of the PC is: " + df.format(chassis.getCost()) + "€\n-----");
		System.out.println("The cost of cpu and its cooling is: " + df.format(cpu.getCost()) + "€");
		System.out.println("The cost of motherboard and its attached components is: " + df.format(mobo.getCost()) + "€");
		
	}

}
