package akiko.decorator;

/**
 * This class does not quite yet work as expected, WORK IN PROGRESS
 * The purpose of this class would be to encode new messages before saving them, and decoding when reading them
 * @author akiko
 *
 */
public class EncryptedMessage extends MessageDecorator{

	public EncryptedMessage(Message dm) {
		super(dm);
	}

	@Override
	public String readMessage() {
		String redMessage = super.readMessage();
		
		byte[] input = redMessage.getBytes();
		byte[] output = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = (byte) (input[i] - 1);
        }

        return output.toString();
	}

	@Override
	public void writeMessage() {
		super.writeMessage();
	}

	@Override
	public String promptForInput() {
		String inputMessage = super.promptForInput();
		
		byte[] input = inputMessage.getBytes();
		byte[] output = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = (byte) (input[i] + 1);
        }

        return output.toString();
	}

}
