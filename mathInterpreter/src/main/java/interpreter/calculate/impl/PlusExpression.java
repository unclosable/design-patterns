package interpreter.calculate.impl;

import interpreter.calculate.Expression;

public class PlusExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public PlusExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public double interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "+";
	}

}
