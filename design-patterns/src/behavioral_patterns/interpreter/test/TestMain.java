package behavioral_patterns.interpreter.test;

import org.junit.Test;

import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class TestMain {
	@Test
	public void test1() {
		String test = "1 2 * 3 + 4 - 5 /";
		double re = PostfixStringHandler.handler(test);
		System.out.println(re);
	}

}
