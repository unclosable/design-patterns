package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanTwo;

public class BeanTwoTwo extends BeanTwo {
	public BeanTwoTwo() {
	}

	public BeanTwoTwo(BeanTwoTwo beanTwoTwo) {
	}

	@Override
	public BeanTwo clone() throws CloneNotSupportedException {
		return new BeanTwoTwo(this);
	}

}
