package behavioral_patterns.observer.src.generic;

public interface Observer<S extends Observer<S, A, O>, A extends Observerable<S, A, O>, O> {
	void upDate(A subject, O thetype);
}
