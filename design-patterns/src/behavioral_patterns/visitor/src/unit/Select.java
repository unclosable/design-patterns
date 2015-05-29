package behavioral_patterns.visitor.src.unit;

import behavioral_patterns.visitor.src.SqlUnit;
import behavioral_patterns.visitor.src.SqlUnitVisitor;

public class Select extends SqlUnit {

	public Select(SqlUnit... sqlUnits) {
		super(sqlUnits);
	}

	@Override
	public void accept(SqlUnitVisitor sqlUnitVisitor) {
		sqlUnitVisitor.visitSelect(this);
		super.accept(sqlUnitVisitor);
	}

	@Override
	public String toString() {
		return "select";
	}
}
