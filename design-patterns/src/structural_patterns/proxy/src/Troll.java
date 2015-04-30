package structural_patterns.proxy.src;

public class Troll {
	private String name;

	public Troll(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
