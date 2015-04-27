package structural_patterns.decorator.test;

import org.junit.Test;

import structural_patterns.decorator.src.ChocolateMilk;
import structural_patterns.decorator.src.Milk;

public class DecoratorTest {
	@Test
	public void test() {
		Milk milk = new Milk();
		milk.eatIt();
		ChocolateMilk chocolateMilk = new ChocolateMilk(milk);// 修饰器
		chocolateMilk.eatIt();
	}

}
