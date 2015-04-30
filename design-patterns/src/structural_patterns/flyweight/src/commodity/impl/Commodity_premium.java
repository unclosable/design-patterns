package structural_patterns.flyweight.src.commodity.impl;

import structural_patterns.flyweight.src.commodity.Commodity;

public class Commodity_premium implements Commodity {

	@Override
	public void sale() {
		System.out.println("premium commodity has been saled");
	}

}
