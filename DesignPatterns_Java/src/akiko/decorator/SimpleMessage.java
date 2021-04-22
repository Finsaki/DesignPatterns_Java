package akiko.decorator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class lets users read messages from file and write new ones into the same one
 * @author akiko
 *
 */
public class SimpleMessage implements Message{

	@Override
	public String readMessage() {
		String fileName = "src/akiko/decorator/messages.txt";
		StringBuilder strings = new StringBuilder();
		strings.append("");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				strings.append(line);
			}
			reader.close();
			return strings.toString();
		} catch (IOException e) {
			System.out.println("Error in reading the file");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void writeMessage() {
		String fileName = "src/messages.txt";
		String msg = promptForInput();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		    writer.append(' ');
		    writer.append(msg);
		    writer.close();
		} catch (IOException e) {
			System.out.println("Error in writing to the file");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String promptForInput() {
		System.out.println("Write your message here: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //closing causes problems for some reason
		String msg = scan.nextLine();
		return msg;
	}

}
