package behavioral_patterns.state.src;

public class State_egg implements State {

	@Override
	public void growUp(Animal animal) {
		animal.setState(new State_child());
	}

	@Override
	public String toString() {
		return "egg";
	}

}
