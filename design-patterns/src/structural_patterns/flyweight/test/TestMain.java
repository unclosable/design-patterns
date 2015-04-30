package structural_patterns.flyweight.test;

import org.junit.Test;

import structural_patterns.flyweight.src.Shop;

public class TestMain {
	@Test
	public void test1() {
		Shop shop = new Shop();
		shop.showTheShopPerformance();
	}
}
