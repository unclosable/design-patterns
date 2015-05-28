package behavioral_patterns.state.src;

public class State_man implements State {

	@Override
	public void growUp(Animal animal) {
		animal.setState(new State_old());
	}

	@Override
	public String toString() {
		return "man";
	}

}
