package akiko.decorator;

/**
 * This is the abstract Decorator class giving access to Message class from the classes extending this one
 * @author akiko
 *
 */
public abstract class MessageDecorator implements Message {
	
	private final Message decoratedMessage;
	
	public MessageDecorator(Message dm) {
		this.decoratedMessage = dm;
	}
	
	@Override
	public String readMessage() {
		return decoratedMessage.readMessage();
	}
	
	@Override
	public void writeMessage() {
		decoratedMessage.writeMessage();
	}
	
	@Override
	public String promptForInput() {
		return decoratedMessage.promptForInput();
	}

}
