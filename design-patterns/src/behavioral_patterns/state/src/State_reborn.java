package behavioral_patterns.state.src;

public class State_reborn implements State {

	@Override
	public void growUp(Animal animal) {
		animal.setState(new State_egg());
	}

	@Override
	public String toString() {
		return "reborn";
	}

}
