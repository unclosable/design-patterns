package behavioral_patterns.interpreter.test;

import org.junit.Test;

import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class TestMain {
	@Test
	public void test1() {
		String test = "3 4 + 1 -";
		double re = PostfixStringHandler.handler(test);
		System.out.println(re);
	}

}
