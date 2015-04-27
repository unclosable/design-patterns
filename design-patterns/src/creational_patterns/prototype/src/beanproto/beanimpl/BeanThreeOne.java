package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanThree;

public class BeanThreeOne extends BeanThree {
	public BeanThreeOne() {
	}

	public BeanThreeOne(BeanThreeOne beanThreeOne) {
	}

	@Override
	public BeanThree clone() throws CloneNotSupportedException {
		return new BeanThreeOne(this);
	}

}
