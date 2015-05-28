package behavioral_patterns.state.src;

public class State_child implements State {

	@Override
	public void growUp(Animal animal) {
		animal.setState(new State_man());
	}

	@Override
	public String toString() {
		return "child";
	}

}
