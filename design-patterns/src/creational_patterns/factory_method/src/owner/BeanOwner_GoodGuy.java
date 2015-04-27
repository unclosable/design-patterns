package creational_patterns.factory_method.src.owner;

import creational_patterns.factory_method.src.bean.Bean;
import creational_patterns.factory_method.src.bean.BeanType;
import creational_patterns.factory_method.src.bean.Bean_LawfulGood;

public class BeanOwner_GoodGuy implements BeanOwner {

	@Override
	public Bean GiveBeanWitchIWant(BeanType beanType) {
		return new Bean_LawfulGood(beanType);
	}

}
