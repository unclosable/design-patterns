package creational_patterns.factory_method.src.owner;

import creational_patterns.factory_method.src.bean.Bean;
import creational_patterns.factory_method.src.bean.BeanType;

public interface BeanOwner {

	Bean GiveBeanWitchIWant(BeanType beanType);
	
}
