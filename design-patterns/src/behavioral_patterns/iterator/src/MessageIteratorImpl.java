package behavioral_patterns.iterator.src;

import java.util.List;

public class MessageIteratorImpl implements MessageIterator {
	private MessageType messageType;
	private MessageBox messageBox;
	private int idx;

	public MessageIteratorImpl(MessageBox box, MessageType messageType) {
		this.idx = -1;
		this.messageBox = box;
		this.messageType = messageType;
	}

	@Override
	public boolean hasNext() {
		return findNextIdx() != -1;
	}

	@Override
	public Message next() {
		this.idx = findNextIdx();
		if (idx != -1)
			return this.messageBox.getMessageList().get(idx);
		return null;
	}

	private int findNextIdx() {
		List<Message> list = this.messageBox.getMessageList();
		boolean finded = false;
		int index = this.idx;
		while (!finded) {
			index++;
			if (index >= list.size()) {
				index = -1;
				break;
			} else {
				if (this.messageType.equals(MessageType.ANY) || this.messageType.equals(list.get(index).getMessageType())) {
					break;
				}
			}
		}
		return index;
	}

}
