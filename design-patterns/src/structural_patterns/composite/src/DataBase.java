package structural_patterns.composite.src;

import java.util.List;

public class DataBase extends FeildComposite {

	public DataBase(List<Table> tables) {
		for (Table table : tables) {
			this.add(table);
		}
	}

	@Override
	protected void printThisBefore() {
		System.out.println(" database:");
	}

	@Override
	protected void printThisAfter() {
		//
	}

}
