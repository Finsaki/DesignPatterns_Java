package akiko.decorator;

import java.util.Scanner;

/**
 * This class restricts the reading and writing messages with a password prompt
 * @author akiko
 *
 */
public class RestrictedMessage extends MessageDecorator{

	public RestrictedMessage(Message dm) {
		super(dm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String readMessage() {
		if (checkPassword()) {
			return super.readMessage();
		} else {
			return "Access denied";
		}
	}

	@Override
	public void writeMessage() {
		if (checkPassword()) {
			super.writeMessage();
		} else {
			System.out.println("Access denied");
		}
	}
	
	private boolean checkPassword() {
		String realPassword = "salasana"; //Very secret
		System.out.println("Write your password here to continue: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //closing causes problems for some reason
		String password = scan.nextLine();
		if (password.equals(realPassword)) {
			return true;
		} else {
			return false;
		}
	}

}
