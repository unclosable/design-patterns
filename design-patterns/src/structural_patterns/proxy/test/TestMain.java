package structural_patterns.proxy.test;

import org.junit.Test;

import structural_patterns.proxy.src.Troll;
import structural_patterns.proxy.src.TrollPieMachineProxy;

public class TestMain {
	@Test
	public void test() {
		TrollPieMachineProxy proxy = new TrollPieMachineProxy();
		proxy.makeTrollPie(new Troll("Tom"));
		proxy.makeTrollPie(new Troll("Jim"));
		proxy.makeTrollPie(new Troll("Jin"));
		proxy.makeTrollPie(new Troll("Jerry"));
		proxy.makeTrollPie(new Troll("Lily"));
	}

}
