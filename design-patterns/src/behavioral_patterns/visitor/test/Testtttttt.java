package behavioral_patterns.visitor.test;

import org.junit.Test;

import behavioral_patterns.visitor.src.unit.Delete;
import behavioral_patterns.visitor.src.unit.Insert;
import behavioral_patterns.visitor.src.unit.Select;
import behavioral_patterns.visitor.src.visitor.DeleteVisitor;
import behavioral_patterns.visitor.src.visitor.InsertVisitor;
import behavioral_patterns.visitor.src.visitor.SelectVisitor;

public class Testtttttt {
	@Test
	public void tet() {
		Select select = new Select(new Select(), new Select(new Delete(), new Insert(new Insert(new Select()))));

		select.accept(new SelectVisitor());
		select.accept(new InsertVisitor());
		select.accept(new DeleteVisitor());

	}
}
