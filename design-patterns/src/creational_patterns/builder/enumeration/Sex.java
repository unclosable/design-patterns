package creational_patterns.builder.enumeration;

public enum Sex {
	MAN, WOMAN, UNKNOWN;
	@Override
	public String toString() {
		switch (this) {
		case MAN:
			return "man";
		case WOMAN:
			return "woman";
		case UNKNOWN:
			return "unknown";

		default:
			return "unknown";
		}
	}
}
