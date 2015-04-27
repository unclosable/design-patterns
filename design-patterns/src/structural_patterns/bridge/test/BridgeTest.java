package structural_patterns.bridge.test;

import org.junit.Test;

import structural_patterns.bridge.src.human.ShamelessHuman;
import structural_patterns.bridge.src.humanimp.person.ShamelessTom;

public class BridgeTest {
	@Test
	public void test() {
		ShamelessHuman shamelessHuman = new ShamelessHuman(new ShamelessTom());
		shamelessHuman.talk();
	}

}
