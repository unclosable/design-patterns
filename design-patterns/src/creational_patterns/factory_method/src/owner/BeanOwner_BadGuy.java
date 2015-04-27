package creational_patterns.factory_method.src.owner;

import creational_patterns.factory_method.src.bean.Bean;
import creational_patterns.factory_method.src.bean.BeanType;
import creational_patterns.factory_method.src.bean.Bean_ChaoticEvil;

public class BeanOwner_BadGuy implements BeanOwner {

	@Override
	public Bean GiveBeanWitchIWant(BeanType beanType) {
		return new Bean_ChaoticEvil(beanType);
	}

}
