package behavioral_patterns.observer.src.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observerable<S extends Observer<S, A, O>, A extends Observerable<S, A, O>, O> {
	List<S> observers;

	public Observerable() {
		this.observers = new CopyOnWriteArrayList<>();
	}

	public void add(S observer) {
		this.observers.add(observer);
	}

	@SuppressWarnings("unchecked")
	public void notifyObservers(O theType) {
		for (S observer : this.observers) {
			observer.upDate((A) this, theType);
		}
	}

}
