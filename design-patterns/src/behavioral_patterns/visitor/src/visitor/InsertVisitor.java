package behavioral_patterns.visitor.src.visitor;

import behavioral_patterns.visitor.src.SqlUnitVisitor;
import behavioral_patterns.visitor.src.unit.Delete;
import behavioral_patterns.visitor.src.unit.Insert;
import behavioral_patterns.visitor.src.unit.Select;

public class InsertVisitor implements SqlUnitVisitor {

	@Override
	public void visitSelect(Select select) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitInsert(Insert insert) {
		System.out.println("insert-visitor get a query : " + insert);
	}

	@Override
	public void visitDelete(Delete delete) {
		// TODO Auto-generated method stub

	}

}
