package behavioral_patterns.interpreter.src.expressionImpl;

import behavioral_patterns.interpreter.src.Expression;

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
