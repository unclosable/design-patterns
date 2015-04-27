package structural_patterns.composite.src;

import java.util.List;

public class Table extends FeildComposite {
	public Table(List<Feild> feilds) {
		for (Feild feild : feilds) {
			this.add(feild);
		}
	}

	@Override
	protected void printThisBefore() {
		System.out.println(" table");

	}

	@Override
	protected void printThisAfter() {
	}

}
