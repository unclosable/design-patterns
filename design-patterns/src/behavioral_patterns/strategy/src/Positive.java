package behavioral_patterns.strategy.src;

public class Positive implements LiveStrategy {

	@Override
	public void live(APerson aPerson) {
		System.out.println(aPerson + "积极的度过了一生");

	}

}
