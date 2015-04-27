package creational_patterns.abstarct_factory.src.basis;

public enum LawType {
	Lawful, Neutrality, Chaos;
	@Override
	public String toString() {
		switch (this) {
		case Lawful:
			return "守序";
		case Neutrality:
			return "中立";
		case Chaos:
			return "混乱";

		default:
			return "error";
		}
	}
}
