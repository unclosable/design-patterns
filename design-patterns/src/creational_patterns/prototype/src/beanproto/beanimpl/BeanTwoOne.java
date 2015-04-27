package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanTwo;

public class BeanTwoOne extends BeanTwo {
	public BeanTwoOne() {
	}

	public BeanTwoOne(BeanTwoOne beanTwoOne) {
	}

	@Override
	public BeanTwo clone() throws CloneNotSupportedException {
		return new BeanTwoOne(this);
	}

}
