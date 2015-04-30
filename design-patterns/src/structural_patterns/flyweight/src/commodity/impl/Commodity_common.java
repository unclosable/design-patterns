package structural_patterns.flyweight.src.commodity.impl;

import structural_patterns.flyweight.src.commodity.Commodity;

public class Commodity_common implements Commodity {

	@Override
	public void sale() {
		System.out.println("common commdity has been saled");
	}

}
