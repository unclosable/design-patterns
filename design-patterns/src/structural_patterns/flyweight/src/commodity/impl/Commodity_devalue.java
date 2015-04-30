package structural_patterns.flyweight.src.commodity.impl;

import structural_patterns.flyweight.src.commodity.Commodity;

public class Commodity_devalue implements Commodity {

	@Override
	public void sale() {
		System.out.println("devalue commodity has been saled");
	}

}
