package main;

import interpreter.calculate.PostfixStringHandler;
import interpreter.resolve.CompileHandler;

public class MathInterpreter {

	public static double getValue(String str) {
		CompileHandler handler = new CompileHandler(str);
		return PostfixStringHandler.handler(handler.handl());
	}

}
