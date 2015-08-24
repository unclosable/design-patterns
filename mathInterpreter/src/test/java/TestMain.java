import org.junit.Test;

import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class TestMain {
	@Test
	public void test1() {
		String test = "123.22 2 * 456 123 456 + * +";
		double re = PostfixStringHandler.handler(test);
		System.out.println(re);
	}

}
