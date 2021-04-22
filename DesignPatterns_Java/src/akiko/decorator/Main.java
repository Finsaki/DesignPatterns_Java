package akiko.decorator;

/**
 * This is the test class for SimpleMessage, RestrictedMessage and EncryptedMessage classes
 * SimpleMessage is the basic class which implements the interface Message
 * RestrictedMessage and EncryptedMessage are decorator classes extending the abstract decorator MessageDecorator
 * 
 * I first started working on the task B to make encryption through decorator, however I had a bit too much problems with this so,
 * I pivoted to make task A instead and completed it by creating a RestrictedMessage class to this same project. It does not use promptForInput method like
 * EncryptedMessage class so I did not add Override function for that.
 * 
 * HINT: password for EncryptedMessage is "salasana"
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 29.03.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message readWriter = new SimpleMessage();
		System.out.println(readWriter.readMessage());
		readWriter.writeMessage();
		System.out.println(readWriter.readMessage());
		
		readWriter = new RestrictedMessage(readWriter);
		System.out.println(readWriter.readMessage());
		readWriter.writeMessage();
		System.out.println(readWriter.readMessage());
		
		//EncryptedMessage class needs some more work, however only one of the three tasks needed to be completed so RestrictedMessage class should be enough
		/*
		readWriter = new EncryptedMessage(readWriter);
		System.out.println(readWriter.readMessage());
		readWriter.writeMessage();
		System.out.println(readWriter.readMessage());
		*/
	}

}
