package behavioral_patterns.state.src;

public class State_old implements State {

	@Override
	public void growUp(Animal animal) {
		animal.setState(new State_reborn());
	}

	@Override
	public String toString() {
		return "old";
	}

}
