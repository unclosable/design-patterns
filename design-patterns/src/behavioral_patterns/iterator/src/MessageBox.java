package behavioral_patterns.iterator.src;

import java.util.ArrayList;
import java.util.List;

public class MessageBox {
	private List<Message> messageList;

	public MessageBox() {
		this.messageList = new ArrayList<Message>();
		this.messageList.add(new Message("HI1", MessageType.HI));
		this.messageList.add(new Message("LOCATION1", MessageType.LOCATION));
		this.messageList.add(new Message("PICTRUE1", MessageType.PICTRUE));
		this.messageList.add(new Message("LOCATION2", MessageType.LOCATION));
		this.messageList.add(new Message("PICTRUE2", MessageType.PICTRUE));
		this.messageList.add(new Message("HI2", MessageType.HI));
		this.messageList.add(new Message("LOCATION3", MessageType.LOCATION));
		this.messageList.add(new Message("PICTRUE3", MessageType.PICTRUE));
		this.messageList.add(new Message("HI3", MessageType.HI));
	}

	public MessageIteratorImpl getIterator(MessageType messageType) {
		return new MessageIteratorImpl(this, messageType);
	}

	public List<Message> getMessageList() {
		List<Message> list = new ArrayList<Message>();
		list.addAll(this.messageList);
		return list;
	}

}
