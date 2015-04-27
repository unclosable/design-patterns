package creational_patterns.factory_method.test;

import org.junit.Test;

import creational_patterns.factory_method.src.bean.Bean;
import creational_patterns.factory_method.src.bean.BeanType;
import creational_patterns.factory_method.src.owner.BeanOwner;
import creational_patterns.factory_method.src.owner.BeanOwner_BadGuy;
import creational_patterns.factory_method.src.owner.BeanOwner_GoodGuy;

public class Factory_Method_test {
	@Test
	public void test() {
		/*
		 * 最终我会得到一个Bean的实例，至于这个Bean是守序善良LawfulGood还是混乱邪恶ChaoticEvil
		 * 由我是从好人（GoodGuy）那里请求这个Bean还是从坏人（BadGuy）那里请求来决定，
		 * 在测试程序这个层面，Bean的实例化是不可见的 我仅可以决定Bean的BeanType
		 */
		BeanOwner beanOwner = new BeanOwner_GoodGuy();
		Bean bean = beanOwner.GiveBeanWitchIWant(BeanType.TYPE_THREE);
		System.out.println(bean);
		beanOwner = new BeanOwner_BadGuy();
		bean = beanOwner.GiveBeanWitchIWant(BeanType.TYPE_ONE);
		System.out.println(bean);
	}

}
