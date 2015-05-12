package behavioral_patterns.interpreter.src;

import java.util.Stack;

import behavioral_patterns.interpreter.src.expressionImpl.DivisionExpression;
import behavioral_patterns.interpreter.src.expressionImpl.MinusExpression;
import behavioral_patterns.interpreter.src.expressionImpl.MultiplyExpression;
import behavioral_patterns.interpreter.src.expressionImpl.NumberExpression;
import behavioral_patterns.interpreter.src.expressionImpl.PlusExpression;

public class PostfixStringHandler {

	public static double handler(String str) {
		String[] strs = str.split(" ");
		Stack<Expression> stack = new Stack<Expression>();

		for (String s : strs) {
			if (isOperators(s)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression re = getExpression(s, leftExpression, rightExpression);
				stack.push(re);
			} else {
				Expression e = new NumberExpression(s);
				stack.push(e);
			}
		}
		return stack.pop().interpret();
	}

	private static Expression getExpression(String s, Expression leftExpression, Expression rightExpression) {
		switch (s) {
		case "+":
			return new PlusExpression(leftExpression, rightExpression);
		case "-":
			return new MinusExpression(leftExpression, rightExpression);
		case "*":
			return new MultiplyExpression(leftExpression, rightExpression);
		case "/":
			return new DivisionExpression(leftExpression, rightExpression);
		default:
			return null;
		}
	}

	private static boolean isOperators(String s) {
		return s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/");
	}

}
