package creational_patterns.singleton;

/*
 * 饿汉式，在代码运行之初就已经建好了对象等待调用
 * 没有线程问题，但是是在加载类的时候就创建了
 * 所以如果是一个工厂模式、缓存了很多实例、那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建。
 */
public class BasicEagerlySingleton {
	private static BasicEagerlySingleton basicEagerlySingleton = new BasicEagerlySingleton();

	private BasicEagerlySingleton() {
	}

	public static BasicEagerlySingleton getInstense() {
		return basicEagerlySingleton;
	}

}
