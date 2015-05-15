package behavioral_patterns.iterator.test;

import org.junit.Test;

import behavioral_patterns.iterator.src.MessageBox;
import behavioral_patterns.iterator.src.MessageIteratorImpl;
import behavioral_patterns.iterator.src.MessageType;

public class TestMain {
	@Test
	public void testn() {
		MessageBox box = new MessageBox();

		MessageIteratorImpl hiMsg = box.getIterator(MessageType.HI);
		while (hiMsg.hasNext())
			System.out.println(hiMsg.next().toString());

	}

}
