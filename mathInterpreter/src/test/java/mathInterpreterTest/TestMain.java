package mathInterpreterTest;

import interpreter.calculate.PostfixStringHandler;
import interpreter.resolve.CompileHandler;
import main.MathInterpreter;

import org.junit.Test;

public class TestMain {
	@Test
	public void test1() {
		String test = "123.22 2 * 456 123 456 + * +";
		double re = PostfixStringHandler.handler(test);
		System.out.println(re);
	}

	@Test
	public void test2() {
		String[] testStrings = { "(2+3)4", "(1+2)", "3(1+2)", "2*-3", "2**-       3", "-(22-10)", "1.22+3", "3.33*4.12/5.22", "3.1(2/3.4)", "3.1*2/3.4", "2*3+4", "-2(3+4)", "-2*-3",
				"-(22-10*(1-1)-3+-2)", "1+++2", "1----2", "4/2", "4     -       3", "-+-+-+-+-+-+2-+-+-+-+-+-3", "8//3", "8**2", "2**-1", "3//-2" };
		for (String s : testStrings) {
			System.out.println("-----------------------------");
			System.out.println("测试字符：" + s);
			CompileHandler handler = new CompileHandler(s);
			String postFix = null;
			try {
				postFix = handler.handl();
			} catch (Exception e) {
				e.printStackTrace();
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

	@Test
	public void test3() throws Exception {
		String[] testStrings = { "(2+3)4", "(1+2)", "3(1+2)", "2*-3", "2**-       3", "-(22-10)", "1.22+3", "3.33*4.12/5.22", "3.1(2/3.4)", "3.1*2/3.4", "2*3+4", "-2(3+4)", "-2*-3",
				"-(22-10*(1-1)-3+-2)", "1+++2", "1----2", "4/2", "4     -       3", "-+-+-+-+-+-+2-+-+-+-+-+-3", "8//3", "8**2", "2**-1", "3//-2", "2(-3)" };
		for (String s : testStrings) {
			System.out.println("-----------------------------");
			System.out.println("测试字符：" + s);
			double re;
			try {
				re = MathInterpreter.getValue(s);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出错:" + s);
				continue;
			}
			System.out.println("测试结果：" + re);
		}

	}

	@Test
	public void test4() throws Exception {
		String[] testStringsErro = { "2***3", "2(*3)", "2-**4" };
		for (String s : testStringsErro) {
			System.out.println("-----------------------------");
			System.out.println("测试字符：" + s);
			double re;
			try {
				re = MathInterpreter.getValue(s);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出错:" + s);
				continue;
			}
			System.out.println("测试结果：" + re);
		}

	}
}
