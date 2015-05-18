package behavioral_patterns.mediator.src;

public enum Work {
	DESIGN, PROGRAMME, TEST, IMPLEMENT;

	@Override
	public String toString() {
		switch (this) {
		case DESIGN:
			return "design the system";
		case IMPLEMENT:
			return "implement the project";
		case PROGRAMME:
			return "coding the project";
		case TEST:
			return "test the code";

		default:
			return null;
		}
	}

}
