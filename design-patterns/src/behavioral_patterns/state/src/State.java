package behavioral_patterns.state.src;

public interface State {
	void growUp(Animal animal);

	@Override
	String toString();
}
