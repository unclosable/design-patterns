package interpreter.calculate;

import interpreter.calculate.impl.DivisionExpression;
import interpreter.calculate.impl.EvolutionExpression;
import interpreter.calculate.impl.MinusExpression;
import interpreter.calculate.impl.MultiplyExpression;
import interpreter.calculate.impl.NumberExpression;
import interpreter.calculate.impl.PlusExpression;
import interpreter.calculate.impl.PowerExpression;

import java.util.Stack;

public class PostfixStringHandler {

	public static double handler(String str) {
		String[] strs = str.split(" ");
		Stack<Expression> stack = new Stack<Expression>();

		for (String s : strs) {
			if (s.trim().isEmpty())
				continue;
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
		case "**":
			return new PowerExpression(leftExpression, rightExpression);
		case "//":
			return new EvolutionExpression(leftExpression, rightExpression);
		default:
			return null;
		}
	}

	private static boolean isOperators(String s) {
		return s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/") || s.equals("**") || s.equals("//");
	}

}
