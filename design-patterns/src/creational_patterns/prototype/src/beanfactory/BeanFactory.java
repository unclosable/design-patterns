package creational_patterns.prototype.src.beanfactory;

import creational_patterns.prototype.src.beanproto.BeanOne;
import creational_patterns.prototype.src.beanproto.BeanThree;
import creational_patterns.prototype.src.beanproto.BeanTwo;

public interface BeanFactory {

	BeanOne creatBeanOne();

	BeanTwo creatBeanTwo();

	BeanThree creatBeanThree();

}
