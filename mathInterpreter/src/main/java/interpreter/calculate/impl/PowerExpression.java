package interpreter.calculate.impl;

import interpreter.calculate.Expression;

public class PowerExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public PowerExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public double interpret() {
		return Math.pow(leftExpression.interpret(), rightExpression.interpret());
	}

	@Override
	public String toString() {
		return "**";
	}

}
