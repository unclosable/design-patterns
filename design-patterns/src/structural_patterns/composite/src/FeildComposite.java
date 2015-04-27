package structural_patterns.composite.src;

import java.util.ArrayList;
import java.util.List;

public abstract class FeildComposite {

	private List<FeildComposite> children = new ArrayList<>();

	public void add(FeildComposite composite) {
		children.add(composite);
	}

	public int count() {
		return children.size();
	}

	protected abstract void printThisBefore();

	protected abstract void printThisAfter();

	public void print() {
		printThisBefore();
		for (FeildComposite composite : children) {
			composite.print();
		}
		printThisAfter();
	}
}
