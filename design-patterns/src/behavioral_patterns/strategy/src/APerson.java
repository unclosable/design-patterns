package behavioral_patterns.strategy.src;

public class APerson {
	private String name;
	private LiveStrategy liveStrategy;

	public APerson(String name) {
		this.name = name;
	}

	public void choosHowToLive(LiveStrategy liveStrategy) {
		this.liveStrategy = liveStrategy;
	}

	public void liveStart() throws Exception {
		if (this.liveStrategy == null)
			throw new Exception();
		this.liveStrategy.live(this);
	}

	@Override
	public String toString() {
		return name;
	}
}
