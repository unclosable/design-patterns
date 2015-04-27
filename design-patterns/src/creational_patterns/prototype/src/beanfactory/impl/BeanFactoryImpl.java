package creational_patterns.prototype.src.beanfactory.impl;

import creational_patterns.prototype.src.beanfactory.BeanFactory;
import creational_patterns.prototype.src.beanproto.BeanOne;
import creational_patterns.prototype.src.beanproto.BeanThree;
import creational_patterns.prototype.src.beanproto.BeanTwo;

public class BeanFactoryImpl implements BeanFactory {
	private BeanOne beanOne;
	private BeanTwo beanTwo;
	private BeanThree beanThree;

	public BeanFactoryImpl(BeanOne beanOne, BeanTwo beanTwo, BeanThree beanThree) {
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.beanThree = beanThree;
	}

	@Override
	public BeanOne creatBeanOne() {
		try {
			return this.beanOne.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public BeanTwo creatBeanTwo() {
		try {
			return this.beanTwo.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public BeanThree creatBeanThree() {
		try {
			return this.beanThree.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
