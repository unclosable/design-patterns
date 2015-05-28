package behavioral_patterns.state.src;

public class Animal {
	private State state;

	public Animal() {
		this.state = new State_egg();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void growUp() {
		this.state.growUp(this);
	}

	@Override
	public String toString() {
		return "this animal is " + this.state;
	}

}
