package behavioral_patterns.iterator.src;

public class Message {
	private MessageType messageType;
	private String message;

	public Message(String message, MessageType messageType) {
		this.message = message;
		this.messageType = messageType;
	}

	@Override
	public String toString() {
		return "this message saies:" + message;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

}
