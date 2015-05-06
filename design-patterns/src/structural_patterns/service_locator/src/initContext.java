package structural_patterns.service_locator.src;

import structural_patterns.service_locator.src.impl.ServiceAimpl;

public class initContext {

	public Object getService(String serviceName) {
		if (serviceName.equals("ServiceA")) {
			System.out.println("Looking up service A and creating new service for A");
			return new ServiceAimpl(serviceName);
		} else
			return null;
	}

}
