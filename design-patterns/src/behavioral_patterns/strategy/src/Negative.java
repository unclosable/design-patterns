package behavioral_patterns.strategy.src;

public class Negative implements LiveStrategy {

	@Override
	public void live(APerson aPerson) {
		System.out.println(aPerson + "浑浑噩噩的度过了一生");
	}

}
