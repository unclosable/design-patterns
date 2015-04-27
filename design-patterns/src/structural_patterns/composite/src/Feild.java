package structural_patterns.composite.src;

public class Feild extends FeildComposite {

	private String feildName;

	public Feild(String feildName) {
		this.feildName = feildName;
	}

	@Override
	protected void printThisBefore() {
		System.out.println(this.feildName);
	}

	@Override
	protected void printThisAfter() {
		// nop

	}

}
