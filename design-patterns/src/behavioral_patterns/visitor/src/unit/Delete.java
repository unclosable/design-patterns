package behavioral_patterns.visitor.src.unit;

import behavioral_patterns.visitor.src.SqlUnit;
import behavioral_patterns.visitor.src.SqlUnitVisitor;

public class Delete extends SqlUnit {
	public Delete(SqlUnit... sqlUnits) {
		super(sqlUnits);
	}

	@Override
	public void accept(SqlUnitVisitor sqlUnitVisitor) {
		sqlUnitVisitor.visitDelete(this);
		super.accept(sqlUnitVisitor);
	}

	@Override
	public String toString() {
		return "delete";
	}

}
