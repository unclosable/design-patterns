package creational_patterns.singleton;

/*
 * 懒汉模式，只有在第一次用到这个实例的时候实例才会被创建
 * 理论效率高于饿汉模式，但要考虑到线程安全
 * 有单次检查，即仅在getInstance()上加锁
 * 两次检查
 * 保证线程安全
 */
public class ThreadSafeLazyLoadedSingleton {
	private static ThreadSafeLazyLoadedSingleton threadSafeLazyLoadedSingleton = null;

	private ThreadSafeLazyLoadedSingleton() {
		if (threadSafeLazyLoadedSingleton != null)
			throw new IllegalStateException("Already initialized.");
	}

	public synchronized static ThreadSafeLazyLoadedSingleton getInstance() {
		ThreadSafeLazyLoadedSingleton re = threadSafeLazyLoadedSingleton;
		if (re == null) {
			synchronized (ThreadSafeLazyLoadedSingleton.class) {
				re = threadSafeLazyLoadedSingleton;
				if (re == null)
					threadSafeLazyLoadedSingleton = re = new ThreadSafeLazyLoadedSingleton();
			}
		}
		return re;
	}

	// public synchronized static ThreadSafeLazyLoadedSingleton getInstance() {
	// if (threadSafeLazyLoadedSingleton == null) {
	// threadSafeLazyLoadedSingleton = new ThreadSafeLazyLoadedSingleton();
	// }
	// return threadSafeLazyLoadedSingleton;
	// }
}
