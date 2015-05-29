package behavioral_patterns.visitor.src.unit;

import behavioral_patterns.visitor.src.SqlUnit;
import behavioral_patterns.visitor.src.SqlUnitVisitor;

public class Insert extends SqlUnit {
	public Insert(SqlUnit... sqlUnits) {
		super(sqlUnits);
	}

	@Override
	public void accept(SqlUnitVisitor sqlUnitVisitor) {
		sqlUnitVisitor.visitInsert(this);
		super.accept(sqlUnitVisitor);
	}

	@Override
	public String toString() {
		return "insert";
	}

}
