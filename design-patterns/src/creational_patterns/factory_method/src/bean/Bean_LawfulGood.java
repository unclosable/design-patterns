package creational_patterns.factory_method.src.bean;

public class Bean_LawfulGood implements Bean {

	private BeanType beanType;

	public Bean_LawfulGood(BeanType beanType) {
		this.beanType = beanType;
	}

	@Override
	public String toString() {
		return "LawfulGood:" + beanType;
	}
}
