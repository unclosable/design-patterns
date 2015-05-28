package behavioral_patterns.strategy.test;

import org.junit.Test;

import behavioral_patterns.strategy.src.APerson;
import behavioral_patterns.strategy.src.Negative;

public class Ttttttttt {
	@Test
	public void nnnn() throws Exception {
		APerson tom = new APerson("tom");
		tom.choosHowToLive(new Negative());
		tom.liveStart();
	}

}
