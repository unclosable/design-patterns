package behavioral_patterns.interpreter.src.expressionImpl;

import behavioral_patterns.interpreter.src.Expression;

public class NumberExpression extends Expression {
	private double value;

	public NumberExpression(String value) {
		this.value = Double.valueOf(value);
	}

	public NumberExpression(double value) {
		this.value = value;
	}

	@Override
	public double interpret() {
		return value;
	}

	@Override
	public String toString() {
		return Double.toString(value);
	}

}
