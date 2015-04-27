package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanThree;

public class BeanThreeTwo extends BeanThree {
	public BeanThreeTwo() {
	}

	public BeanThreeTwo(BeanThreeTwo beanThreeTwo) {
	}

	@Override
	public BeanThree clone() throws CloneNotSupportedException {
		return new BeanThreeTwo(this);
	}

}
