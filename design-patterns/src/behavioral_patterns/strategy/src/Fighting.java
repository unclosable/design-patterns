package behavioral_patterns.strategy.src;

public class Fighting implements LiveStrategy {

	@Override
	public void live(APerson aPerson) {
		System.out.println(aPerson + "很早就死了");
	}

}
