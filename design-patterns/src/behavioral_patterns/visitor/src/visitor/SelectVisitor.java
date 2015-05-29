package behavioral_patterns.visitor.src.visitor;

import behavioral_patterns.visitor.src.SqlUnitVisitor;
import behavioral_patterns.visitor.src.unit.Delete;
import behavioral_patterns.visitor.src.unit.Insert;
import behavioral_patterns.visitor.src.unit.Select;

public class SelectVisitor implements SqlUnitVisitor {

	@Override
	public void visitSelect(Select select) {
		System.out.println("select-visitor get a query : " + select);
	}

	@Override
	public void visitInsert(Insert insert) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDelete(Delete delete) {
		// TODO Auto-generated method stub

	}

}
