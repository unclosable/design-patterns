import org.junit.Test;

import reversePolishNotation.CompileHandler;
import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class TestMain {
	@Test
	public void test1() {
		String test = "123.22 2 * 456 123 456 + * +";
		double re = PostfixStringHandler.handler(test);
		System.out.println(re);
	}

	@Test
	public void test2() {
		String[] testStrings = { "(2+3)4", "(1+2)", "3(1+2)", "2*-3", "2**-3", "-(22-10)", "1.22+3", "3.33*4.12/5.22", "3.1(2/3.4)", "3.1*2/3.4", "2*3+4", "-2(3+4)", "-2*-3", "-(22-10*(1-1)-3+-2)",
				"1+++2", "1----2", "4/2", "4-3" };
		for (String s : testStrings) {
			System.out.println("-----------------------------");
			System.out.println("测试字符：" + s);
			CompileHandler handler = new CompileHandler(s);
			String postFix = null;
			try {
				postFix = handler.handl();
			} catch (Exception e) {
				System.out.println("后缀式解析出错，退出");
			}
			System.out.println("后缀式：" + postFix);
			try {
				System.out.println("计算结果：" + PostfixStringHandler.handler(postFix));
			} catch (Exception e) {
				System.out.println("计算出错，退出");
			}
		}
	}
}
