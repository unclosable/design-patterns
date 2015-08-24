package main;

import reversePolishNotation.CompileHandler;
import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class MathInterpreter {

	public static double getValue(String str) {
		CompileHandler handler = new CompileHandler(str);
		return PostfixStringHandler.handler(handler.handl());
	}

}
