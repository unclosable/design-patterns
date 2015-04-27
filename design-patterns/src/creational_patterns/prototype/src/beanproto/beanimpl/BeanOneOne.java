package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanOne;

public class BeanOneOne extends BeanOne {
	public BeanOneOne() {
	}

	public BeanOneOne(BeanOneOne beanOneOne) {
	}

	@Override
	public BeanOne clone() throws CloneNotSupportedException {
		return new BeanOneOne(this);
	}

}
