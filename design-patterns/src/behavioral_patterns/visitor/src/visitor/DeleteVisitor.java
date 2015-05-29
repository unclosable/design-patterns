package behavioral_patterns.visitor.src.visitor;

import behavioral_patterns.visitor.src.SqlUnitVisitor;
import behavioral_patterns.visitor.src.unit.Delete;
import behavioral_patterns.visitor.src.unit.Insert;
import behavioral_patterns.visitor.src.unit.Select;

public class DeleteVisitor implements SqlUnitVisitor {

	@Override
	public void visitSelect(Select select) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitInsert(Insert insert) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDelete(Delete delete) {
		System.out.println("delete-visitor get a query : " + delete);
	}

}
