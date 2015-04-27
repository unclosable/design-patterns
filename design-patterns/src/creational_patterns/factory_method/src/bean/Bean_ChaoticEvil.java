package creational_patterns.factory_method.src.bean;

public class Bean_ChaoticEvil implements Bean {
	private BeanType beanType;

	public Bean_ChaoticEvil(BeanType beanType) {
		this.beanType = beanType;
	}

	@Override
	public String toString() {
		return "ChaoticEvil:" + beanType;
	}
}
