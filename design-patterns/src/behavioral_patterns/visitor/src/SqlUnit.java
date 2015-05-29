package behavioral_patterns.visitor.src;

public abstract class SqlUnit {
	private SqlUnit[] child;

	public SqlUnit(SqlUnit... sqlUnits) {
		this.child = sqlUnits;
	}

	public void accept(SqlUnitVisitor sqlUnitVisitor) {
		for (SqlUnit sqlUnit : child) {
			sqlUnit.accept(sqlUnitVisitor);
		}
	}

}
