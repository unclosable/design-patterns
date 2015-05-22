package behavioral_patterns.memento.src;

public enum PlantType {
	BUD, SPROUT, FRUIT, JUNK;

	@Override
	public String toString() {
		switch (this) {
		case BUD:
			return "BUD";
		case SPROUT:
			return "SPROUT";
		case FRUIT:
			return "FRUIT";
		case JUNK:
			return "JUNK";
		default:
			return null;
		}
	}

}
