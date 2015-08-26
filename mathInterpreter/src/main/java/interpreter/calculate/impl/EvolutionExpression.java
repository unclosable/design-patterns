package interpreter.calculate.impl;

import interpreter.calculate.Expression;

public class EvolutionExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public EvolutionExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public double interpret() {
		return Math.pow(leftExpression.interpret(), 1.0 / rightExpression.interpret());
	}

	@Override
	public String toString() {
		return "//";
	}

}
