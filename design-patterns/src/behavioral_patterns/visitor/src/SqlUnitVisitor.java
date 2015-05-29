package behavioral_patterns.visitor.src;

import behavioral_patterns.visitor.src.unit.Delete;
import behavioral_patterns.visitor.src.unit.Insert;
import behavioral_patterns.visitor.src.unit.Select;

public interface SqlUnitVisitor {

	void visitSelect(Select select);

	void visitInsert(Insert insert);

	void visitDelete(Delete delete);

}
