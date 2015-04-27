package creational_patterns.prototype.src.beanproto.beanimpl;

import creational_patterns.prototype.src.beanproto.BeanOne;

public class BeanOneTwo extends BeanOne {

	public BeanOneTwo() {
	}

	public BeanOneTwo(BeanOneTwo beanOneTwo) {
	}

	@Override
	public BeanOne clone() throws CloneNotSupportedException {
		return new BeanOneTwo(this);
	}

}
