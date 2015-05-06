package structural_patterns.service_locator.test;

import org.junit.Test;

import structural_patterns.service_locator.src.ServiceLocator;

public class testMain {

	@Test
	public void test1() {
		ServiceLocator locator = new ServiceLocator();
		locator.getService("ServiceA").say();
		locator.getService("ServiceA").say();
		locator.getService("ServiceA").say();
	}

}
