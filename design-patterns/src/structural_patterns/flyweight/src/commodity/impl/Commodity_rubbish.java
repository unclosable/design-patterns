package structural_patterns.flyweight.src.commodity.impl;

import structural_patterns.flyweight.src.commodity.Commodity;

public class Commodity_rubbish implements Commodity {

	@Override
	public void sale() {
		System.out.println("rubbish commodity has been saled");
	}

}
