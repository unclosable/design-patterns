package interpreter.calculate.impl;

import interpreter.calculate.Expression;

public class MinusExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public MinusExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public double interpret() {
		return this.leftExpression.interpret()
				- this.rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "-";
	}

}
